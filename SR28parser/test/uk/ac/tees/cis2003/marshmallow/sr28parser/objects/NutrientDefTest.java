/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.sr28parser.objects;

import uk.ac.tees.cis2003.marshmallow.sr28parser.objects.NutrientDef;
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
public class NutrientDefTest {
    
    private static NutrientDef testNutrient;
    
    public NutrientDefTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        testNutrient = new NutrientDef("~100~^~g~^~TST~^~Test Nutrient~^~1~^~234~");
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
     * Test of getId method, of class Nutrient.
     */
    @Test
    public void testGetId() {
        int expResult = 100;
        int result = testNutrient.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnits method, of class Nutrient.
     */
    @Test
    public void testGetUnits() {
        String expResult = "g";
        String result = testNutrient.getUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Nutrient.
     */
    @Test
    public void testGetDescription() {
        String expResult = "Test Nutrient";
        String result = testNutrient.getDescription();
        assertEquals(expResult, result);
    }

    
}
