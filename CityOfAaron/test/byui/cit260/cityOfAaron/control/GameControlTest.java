/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.GameControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sterling
 */
public class GameControlTest {
    
    public GameControlTest() {
    }




    /**
     * Test of calculateRating method, of class GameControl.
     */
    public void testCalculateRating() {
    }
    
    @Test
    public void testCalculateRating1() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = 6000;
        int startInventory = 2700;
        int population = 1260;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = 24;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCalculateRating2() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = -1;
        int startInventory = 2700;
        int population = 1260;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = -1;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculateRating3() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = 6000;
        int startInventory = 2700;
        int population = -1;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = -1;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculateRating4() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = 60000;
        int startInventory = 2700;
        int population = 1;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = 19;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculateRating5() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = 1;
        int startInventory = 2700;
        int population = 10260;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = 202;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculateRating6() throws GameControlException {
        System.out.println("calculateRating1");
        int currentInventory = 1000000;
        int startInventory = 2700;
        int population = 0;
        int startPopulation = 100;
        GameControl instance = new GameControl();
        int expResult = 367;
        int result = instance.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of liveTheYear method, of class GameControl.
     */
    @Test
    public void testLiveTheYear() throws GameControlException {
        System.out.println("liveTheYear");
        int expResult = 0; // I know this doesn't work yet.
        int result = GameControl.liveTheYear();
        assertEquals(expResult, result);
    }
    
}
