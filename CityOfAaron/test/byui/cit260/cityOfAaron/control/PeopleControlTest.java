/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charlot
 */
public class PeopleControlTest {
    
    public PeopleControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of shrinkPopulation method, of class PeopleControl.
     */
    @Test
    public void testShrinkPopulation() {
        System.out.println("shrinkPopulation");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int foodBushels = 60000;
        int BUSHELS_PER_PERSON = 20;
        int currentPopulation = 7000;
        int expResult = 300; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        }
    
    @Test
    public void testCase2 () {
    
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        int foodBushels = 10;
        int BUSHELS_PER_PERSON = 20;
        int currentPopulation = 700;
        int expResult = 0.5; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testCase3 () {
    
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        int foodBushels = 6000;
        int BUSHELS_PER_PERSON = null;
        int currentPopulation = 0;
        int expResult = error; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        
    }
  @Test
    public void testCase4 () {
    
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        int foodBushels = 20;
        int BUSHELS_PER_PERSON = 20;
        int currentPopulation = 700;
        int expResult = 1; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testCase5 () {
    
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        int foodBushels = 6000;
        int BUSHELS_PER_PERSON = 20;
        int currentPopulation = 300;
        int expResult = 300; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase6 () {
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        int foodBushels = 1000000;
        int BUSHELS_PER_PERSON = 20;
        int currentPopulation = 10000;
        int expResult = 50000; // define the expected output value
        
        // call the method
        int result = PeopleControl.shrinkPopulation(foodBushels, BUSHELS_PER_PERSON, currentPopulation);
        assertEquals(expResult, result);
        
    }  
}

