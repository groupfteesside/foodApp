/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.objects;

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
public class WeightTest
{
    private static Weight testWeight;
    
    public WeightTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        testWeight = new Weight("~100~^2^3^~cup, or maybe a glass~^12.3^^");
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getFood method, of class Weight.
     */
    @Test
    public void testGetFood()
    {
        Food expResult = null;
        Food result = testWeight.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeq method, of class Weight.
     */
    @Test
    public void testGetSeq()
    {
        int expResult = 2;
        int result = testWeight.getSeq();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Weight.
     */
    @Test
    public void testGetAmount()
    {
        double expResult = 3;
        double result = testWeight.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDescription method, of class Weight.
     */
    @Test
    public void testGetDescription()
    {
        String expResult = "cup, or maybe a glass";
        String result = testWeight.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGramWeight method, of class Weight.
     */
    @Test
    public void testGetGramWeight()
    {
        double expResult = 12.3;
        double result = testWeight.getGramWeight();
        assertEquals(expResult, result, 0.0);
    }
    
}
