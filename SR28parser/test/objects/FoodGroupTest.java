/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s6115598
 */
public class FoodGroupTest {
    
    private static final String FD_GROUP = "~100~^~Test Group~";
    private static FoodGroup testGroup;
    
    public FoodGroupTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        testGroup = new FoodGroup(FD_GROUP);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class FoodGroup.
     */
    @Test
    public void testGetId() {
        int expResult = 100;
        int result = testGroup.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class FoodGroup.
     */
    @Test
    public void testGetDescription() {
        String expResult = "Test Group";
        String result = testGroup.getDescription();
        assertEquals(expResult, result);
    }
    
}
