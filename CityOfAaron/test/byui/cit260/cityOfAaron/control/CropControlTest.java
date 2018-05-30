package byui.cit260.cityOfAaron.control;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sterling
 */
public class CropControlTest {
    
    public CropControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of harvestCrops method, of class CropControl.
     */
    @Test
    public void testHarvestCrops() {
        System.out.println("harvestCrops");
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
        testCase7();
    }
        
    private void testCase1 () { // ---- Test case 1 ----
        System.out.println("/tTest case 1");
        
        // define the input variables
        int offerings = 100;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 3600; // define the expected result variable
        
        // call the method
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
    }
        
    private void testCase2 () {
        // ---- Test case 2 ----
        System.out.println("/tTest case 2");
        
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
    
     private void testCase3() {    
        // ---- Test case 3 ----
        System.out.println("/tTest case 3");
        
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
        
     private void testCase4() {        
        // ---- Test case 4 ----
        System.out.println("/tTest case 4");
        
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
             
     private void testCase5() {
     // ---- Test case 5 ----
        System.out.println("/tTest case 5");
        
        // define the input variables
        int offerings = 0;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 2400; // define the expected result variable
        
        // call the method
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);  
     }
        
    private void testCase6() {
     // ---- Test case 6 ----
        System.out.println("/tTest case 6");
        
        // define the input variables
        int offerings = 1000;
        int previousCropYield = 1000;
        int acres = 1200;
        
        int expResult = 4800; // define the expected result variable
        
        // call the method
        int result = CropControl.harvestCrops(offerings, previousCropYield, acres);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);   
    }
    
    private void testCase7() {    
        // ---- Test case 7 ----
        System.out.println("/tTest case 7");
        
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
