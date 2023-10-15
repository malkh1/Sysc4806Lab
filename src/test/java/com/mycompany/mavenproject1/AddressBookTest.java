package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.models.AddressBook;
import com.mycompany.mavenproject1.models.BuddyInfo;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



/**
 * Test class for AddressBook class
 * @author Mohammad 101162465
*/

public class AddressBookTest {

    private AddressBook instance;
    
    @Before
    public void setUp() throws Exception {
        instance = new AddressBook();
        instance.addBuddy(new BuddyInfo("jimmy", "613-111-2222"));
        instance.addBuddy(new BuddyInfo("tom", "613-345-5678"));
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
        BuddyInfo expResult = new BuddyInfo("jimmy", "613-111-2222");
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
        BuddyInfo expResult = new BuddyInfo("tom", "613-345-5678");
        BuddyInfo result = instance.removeBuddyInfo(name);
        assertEquals(expResult.getName(), result.getName());
        
    }
    
}
