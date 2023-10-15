
package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mohammad 101162465
 */
/*
@RestController
@RequestMapping(value="/api")*/
public class AddressBookController {
    /*
    private final AddressBookRepository repo;

    @Autowired
    public AddressBookController(AddressBookRepository repo) {
        this.repo = repo;
    }
    
    @PostMapping("/addaddressbook")
    public AddressBook createEntity(@RequestBody AddressBook addressbook) {
        return repo.save(addressbook);
    }
    
    @DeleteMapping("/addaddressbook")
    public String deleteEntity(@RequestBody AddressBook book) {
        boolean beforeRemoval = repo.existsById(book.getId());
        repo.delete(book);
        boolean afterRemoval = repo.existsById(book.getId());
        if (beforeRemoval != afterRemoval) {
            return book.getId() + " was removed.";
        }
        return book.getId() + " was not found in the database.";
    }*/
}
