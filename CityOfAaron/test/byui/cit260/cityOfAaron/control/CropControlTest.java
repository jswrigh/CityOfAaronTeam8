package byui.cit260.cityOfAaron.control;

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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
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
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
        // test to see if the result returned equals the expected result
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
