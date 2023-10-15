package com.mycompany.mavenproject1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/**
 * Class that encapsulates an entry in an address book
 * @author Mohammad 101162465
 */
@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    @Column(nullable = false, length = 30)
    private String name;
    @Column
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Default constructor for following JavaBeans convention
     */
    public BuddyInfo() {}
    /**
     * Constructor for instantiating a BuddyInfo object with arguments for 
     * its fields
     * @param name name of the buddy
     * @param phoneNumber phone number of the buddy
     */
    public BuddyInfo (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    
    /**
     * returns the buddy's info in a formatted string
     * @return formatted string containing the buddy's info
     */
    @Override
    public String toString () {
        return "Name: " + name + "\nPhone number: " + phoneNumber + "\n";
    }
    
    /**
     * Get the name string of the buddy
     * @return Name of buddy
     */
    public String getName() {
        return name;
    }
    
}
