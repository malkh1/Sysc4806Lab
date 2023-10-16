package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.models.BuddyInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test class for BuddyInfo class
 * @author Mohammad 101162465
 */
public class BuddyInfoTest {
    private BuddyInfo instance;

    {
        instance = new BuddyInfo("jimmy", "613-111-2222");
    }

    /**
     * Test of getInfo method, of class BuddyInfo.
     */
    @Test
    public void testToString() {
        System.out.println("getInfo");
        
        String expResult = "Name: jimmy\nPhone number: 613-111-2222\n";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getName method, of class BuddyInfo.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "jimmy";
        String result = instance.getName();
        assertEquals(expResult, result);

    }
     
    
}
