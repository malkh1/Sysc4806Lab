package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.BuddyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
public class BuddyInfoController {
    /*
    private final BuddyInfoRepository repo;
    
   @Autowired 
   public BuddyInfoController(BuddyInfoRepository repo) {
       this.repo = repo;
   }
   @GetMapping("/hello")
   public String hello() {
       return "hello world this is from get controller";
   }
   
   @PostMapping("/addbuddyinfo")
   public BuddyInfo
        createEntity(@RequestBody BuddyInfo buddyInfo) {           
       return repo.save(buddyInfo);
   }
   
   @DeleteMapping("/addbuddyinfo")
   public String deleteEntity(@RequestBody BuddyInfo buddyInfo) {
       boolean beforeRemoval = repo.existsById(buddyInfo.getId());
       repo.delete(buddyInfo);
       boolean afterRemoval = repo.existsById(buddyInfo.getId());
       if(beforeRemoval != afterRemoval)
           return buddyInfo.getId()+ " was removed.";
       return buddyInfo.getId() + " was not found in the database.";
   }*/
}
