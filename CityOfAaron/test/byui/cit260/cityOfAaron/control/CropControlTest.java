package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.CropControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sterling
 */
public class CropControlTest {
    
    public CropControlTest() {
    }
    
     /**
     * Test of harvestCrops method, of class CropControl.
     */
    public void testHarvestCrops() {
    }
    @Test    
    public void testCase1 () { 
        // --- Test case 1 ----
        System.out.println("Test case 1");
        
        // define the input variables
        int offerings = 100;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 4800; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
    }
        
    @Test    
    public void testCase2 () {
        // ---- Test case 2 ----
        System.out.println("Test case 2");
        
        // define the input variables
        int offerings = -100;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = -1; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
    }
    
    @Test    
     public void testCase3() {    
        // ---- Test case 3 ----
        System.out.println("Test case 3");
        
        // define the input variables
        int offerings = 100;
        int previousCropYield = -1;
        int acres = 1200;
        
        int expResult = -1; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);   
     }
        
    @Test    
     public void testCase4() {        
        // ---- Test case 4 ----
        System.out.println("Test case 4");
        
        // define the input variables
        int offerings = 100;
        int previousCropYield = 1000;
        int acres = -1;
        
        int expResult = -1; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result); 
     } 
             
    @Test    
     public void testCase5() {
     // ---- Test case 5 ----
        System.out.println("Test case 5");
        
        // define the input variables
        int offerings = 0;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 3600; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);  
     }
        
    @Test    
    public void testCase6() {
     // ---- Test case 6 ----
        System.out.println("Test case 6");
        
        // define the input variables
        int offerings = 1000;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 6000; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);   
    }
    
    @Test    
    public void testCase7() {    
        // ---- Test case 7 ----
        System.out.println("Test case 7");
        
        // define the input variables
        int offerings = 1;
        int previousCropYield = 1000;
        int acres = 0;
        
        int expResult = 0; // define the expected result variable
        
        // call the method
        int result = 0;
        try {
            result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    * Test of calcRatFood method of class CropControl.
    */
    
    public void testRatFood() {
    }
    
    @Test    
    public void testRatFoodCase1 () { 
        
        // Test Case 1
        System.out.println("Test Rat Food Case 1");
        
        // Inputs
        int offerings = 45;
        int wheat = 500;
        
        // Expected Result
        int expResult = 465;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
    }
        
    @Test    
    public void testRatFoodCase2 () {
        
        // Test Case 2
        System.out.println("Test Rat Food Case 2");
        
        // Inputs
        int offerings = -5;
        int wheat = -36;
        
        // Expected Result
        int expResult = -1;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
    }
    
    @Test    
     public void testRatFoodCase3() {    
        
        // Test Case 3
        System.out.println("Test Rat Food Case 3");
        
        // Inputs
        int offerings = -39;
        int wheat = -13;
        
        // Expected Result
        int expResult = -1;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
     }
        
    @Test    
     public void testRatFoodCase4() {        
        
        // Test Case 4
        System.out.println("Test Rat Food Case 4");
        
        // Inputs
        int offerings = -75;
        int wheat = 5000;
        
        // Expected Result
        int expResult = -1;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
     } 
             
    @Test    
     public void testRatFoodCase5() {
     
        // Test Case 5
        System.out.println("Test Rat Food Case 5");
        
        // Inputs
        int offerings = 0;
        int wheat = 0;
        
        // Expected Result
        int expResult = 0;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
     }
        
    @Test    
    public void testRatFoodCase6() {
        
        // Test Case 6
        System.out.println("Test Rat Food Case 6");
        
        // Inputs
        int offerings = 500;
        int wheat = 0;
        
        // Expected Result
        int expResult = 0;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
    }
    
    @Test    
    public void testRatFoodCase7() {    
        
        // Test Case 7
        System.out.println("Test Rat Food Case 7");
        
        // Inputs
        int offerings = 0;
        int wheat = 7000;
        
        // Expected Result
        int expResult = 6300;
        
        // Call Method
        int result = 0;
        try {
            result = CropControl.calcRatFood(offerings, wheat);
        } catch (CropControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Test Results
        assertEquals(expResult, result);
    }
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * Test of randomInt method, of class CropControl.
     */
    @Test
    public void testRandomInt() {
        System.out.println("randomInt");
        int lower = 0;
        int upper = 0;
        int expResult = 0;
        int result = CropControl.randomInt(lower, upper);
        assertEquals(expResult, result);
     }
    
}
