
package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.ui.Model;

/**
 *
 * @author Mohammad 101162465
 */
@Controller
public class HomeController {
    @Autowired
    private BuddyInfoRepository buddyRepo;
    
    @Autowired
    private AddressBookRepository bookRepo;
    
    @RequestMapping(value = "/home")
    public String home(Model model) {
        //List<BuddyInfo> buddyList = (List<BuddyInfo>) buddyRepo.findAll();
                //model.addAttribute("buddyList",buddyList);
        List<AddressBook> bookList = (List<AddressBook>) bookRepo.findAll();
        System.out.println("home controller home method called!");
        model.addAttribute("bookList", bookList);
        System.out.println("is this buddylist null?");
        if (!bookList.isEmpty()) {
            System.out.println("its not null!");
            AddressBook ad= bookList.get(0);
            System.out.println(ad.getBuddyInfoList());
            // rest of your code
        }
        else{
            System.out.println("its null!");
 
        }
        System.out.println(bookList.size());
        return "home";
    }
}
