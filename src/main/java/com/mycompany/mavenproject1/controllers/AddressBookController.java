
package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.AddressBook;
import com.mycompany.mavenproject1.models.BuddyInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Mohammad 101162465
 */

@Controller
public class AddressBookController {
    
   
    private final AddressBookRepository bookRepo;
    
    private final BuddyInfoRepository buddyRepo;

    @Autowired
    public AddressBookController(AddressBookRepository bookRepo, BuddyInfoRepository buddyRepo) {
        this.bookRepo = bookRepo;
        this.buddyRepo = buddyRepo;
    }
    
    @PostMapping("/home/createbook")
    public String createBook(Model model, @ModelAttribute AddressBook addressbook) {
        bookRepo.save(addressbook);
        List<AddressBook> bookList = (List<AddressBook>) bookRepo.findAll();
        model.addAttribute("bookList", bookList);
        System.out.println("create entity from addressbook controller got called");
        return "home";
    }
    
    @Transactional
    @PostMapping("/home/addbuddy")
    public String addBuddy(Model model, @RequestParam("bookId") Long bookId,
            @RequestParam("name") String name, 
            @RequestParam("phonenumber") String phoneNumber,
            @RequestParam("address") String address) {
        
        BuddyInfo newBuddy = new BuddyInfo(name, phoneNumber, address);
        AddressBook addressBook = bookRepo.findById(bookId).orElse(null);

        addressBook.addBuddy(newBuddy);
        bookRepo.save(addressBook);
        model.addAttribute("bookList", (List<AddressBook>) bookRepo.findAll());
        return "home";
    }
}
