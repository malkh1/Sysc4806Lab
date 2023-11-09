package com.mycompany.mavenproject1.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * represents an address book that contains entries of friends with their names
 * and phone numbers
 *
 * @author Mohammad 101162465
 */
@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private Long Id;

    @JoinColumn
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddyInfoList;
    

    public List<BuddyInfo> getBuddyInfoList() {
        return buddyInfoList;
    }

    /**
     * instantiates the AddressBook object with no entries by default
     */
    public AddressBook() {
        buddyInfoList = new ArrayList<>();
    }

    /**
     * get the Id of this AddressBook object
     * @return Id of the AddressBook as a Long
     */
    public Long getId() {
        return Id;
    }

    /**
     * set the id of this AddressBook object
     * @param Id long val needed to set objects Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }
    
    /**
     * print the contents of the entries in the address book
     */
    @Override
    public String toString() {
        return buddyInfoList.toString();
    }

    /**
     * add a BuddyInfo entry into the address book
     *
     * @param bi the BuddyInfo object that you want to add
     */
    public void addBuddy(BuddyInfo bi) {
        buddyInfoList.add(bi);
    }

    /**
     * retrieve a BuddyInfo object from the address book list
     *
     * @param name the name of the buddy whose info you want
     * @return the BuddyInfo object of the buddy you are looking for
     * @throw error if the buddy is not in the address book
     */
    public BuddyInfo getBuddyInfo(String name) {
        for (BuddyInfo b : buddyInfoList) {
            if (name.equals(b.getName())) {
                return b;
            }
        }

        throw new NoSuchElementException(name + " was not found in the addressbook.");
    }

    /**
     * removes a BuddyInfo object from the address book list and returns the
     * object to you
     *
     * @param name the name of the buddy whose info you want
     * @return the BuddyInfo object of the buddy you are removing
     * @throw error if the buddy is not in the address book
     */
    public BuddyInfo removeBuddyInfo(String name) {
        for (BuddyInfo b : buddyInfoList) {
            if (name.equals(b.getName())) {
                buddyInfoList.remove(b);
                return b;
            }
        }

        throw new NoSuchElementException(name + " was not found in the addressbook.");
    }

    
}
