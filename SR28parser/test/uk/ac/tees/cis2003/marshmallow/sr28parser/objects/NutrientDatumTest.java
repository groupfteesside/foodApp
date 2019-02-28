/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.sr28parser.objects;

import uk.ac.tees.cis2003.marshmallow.sr28parser.objects.NutrientDatum;
import uk.ac.tees.cis2003.marshmallow.sr28parser.objects.NutrientDef;
import uk.ac.tees.cis2003.marshmallow.sr28parser.objects.Food;
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
public class NutrientDatumTest
{
    private static NutrientDatum testNutrientDatum;
    
    
    public NutrientDatumTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        testNutrientDatum = new NutrientDatum("~01001~^~203~^0.85^16^0.074^~1~^~~^~~^~~^^^^^^^~~^11/1976^");
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
     * Test of getFood method, of class NutrientDatum.
     */
    @Test
    public void testGetFood()
    {
        Food expResult = null;
        Food result = testNutrientDatum.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNutrient method, of class NutrientDatum.
     */
    @Test
    public void testGetNutrient()
    {
        NutrientDef expResult = null;
        NutrientDef result = testNutrientDatum.getNutrient();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class NutrientDatum.
     */
    @Test
    public void testGetValue()
    {
        double expResult = 0.85;
        double result = testNutrientDatum.getValue();
        assertEquals(expResult, result, 0.0);
    }
    
}
