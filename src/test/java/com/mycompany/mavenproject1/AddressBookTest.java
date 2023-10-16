package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.models.AddressBook;
import com.mycompany.mavenproject1.models.BuddyInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



/**
 * Test class for AddressBook class
 * @author Mohammad 101162465
*/

public class AddressBookTest {

    private AddressBook instance = new AddressBook();
    {
        instance.addBuddy(new BuddyInfo("jimmy", "613-111-2222", "112 abc rd"));
        instance.addBuddy(new BuddyInfo("tom", "613-345-5678", "122 abc rd"));
    }
    /**
     * Test of printAddressBook method, of class AddressBook.
     */
    @Test
    public void testPrintAddressBook() {
        System.out.println("printAddressBook");
        instance.toString();
    }

    /**
     * Test of addBuddy method, of class AddressBook.
     */
    @Test
    public void testAddBuddy() {
        System.out.println("addBuddy");
        BuddyInfo bi = null;
        instance.addBuddy(bi);
    }

    /**
     * Test of getBuddyInfo method, of class AddressBook.
     */
    @Test
    public void testGetBuddyInfo() {
        System.out.println("getBuddyInfo");
        String name = "jimmy";
        BuddyInfo expResult = new BuddyInfo("jimmy", "613-111-2222", "1212 abc rd");
        BuddyInfo result = instance.getBuddyInfo(name);
        assertEquals(expResult.getName(), result.getName());

    }

    /**
     * Test of removeBuddyInfo method, of class AddressBook.
     */
    @Test
    public void testRemoveBuddyInfo() {
        System.out.println("removeBuddyInfo");
        String name = "tom";
        BuddyInfo expResult = new BuddyInfo("tom", "613-345-5678", "982 abc rd");
        BuddyInfo result = instance.removeBuddyInfo(name);
        assertEquals(expResult.getName(), result.getName());
        
    }
    
}
