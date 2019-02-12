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
public class ItemTest {
    
    private static final String FOOD_DESC = "~100~^~12345~^~Test Product~^~TEST PRODUCT~^~~^~Food, inc.~^~~";
    private static Item testItem;
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        testItem = new Item(FOOD_DESC);
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
     * Test of getId method, of class Item.
     */
    @Test
    public void testGetId() {
        int expResult = 100;
        int result = testItem.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGroup method, of class Item.
     */
    @Test
    public void testGetGroup() {
        FoodGroup expResult = null;
        FoodGroup result = testItem.getGroup();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLongDesc method, of class Item.
     */
    @Test
    public void testGetLongDesc() {
        String expResult = "Test Product";
        String result = testItem.getLongDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getShortDesc method, of class Item.
     */
    @Test
    public void testGetShortDesc() {
        String expResult = "TEST PRODUCT";
        String result = testItem.getShortDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getManufacturer method, of class Item.
     */
    @Test
    public void testGetManufacturer() {
        String expResult = "Food, inc.";
        String result = testItem.getManufacturer();
        assertEquals(expResult, result);
    }
    
}
