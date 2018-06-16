/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

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
     * Test of startGame method, of class GameControl.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        String playerName = "";
        int expResult = 0;
        int result = GameControl.startGame(playerName);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadGame method, of class GameControl.
     */
    @Test
    public void testLoadGame() {
        System.out.println("loadGame");
        String fileName = "";
        int expResult = -1; // I know this doesn't work yet.
        int result = GameControl.loadGame(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        String fileName = "";
        int expResult = 0;
        int result = GameControl.saveGame(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateRating method, of class GameControl.
     */
    public void testCalculateRating() {
    }
    
    @Test
    public void testCalculateRating1() {
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
    public void testCalculateRating2() {
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
    public void testCalculateRating3() {
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
    public void testCalculateRating4() {
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
    public void testCalculateRating5() {
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
    public void testCalculateRating6() {
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
    public void testLiveTheYear() {
        System.out.println("liveTheYear");
        int expResult = 0;
        int result = GameControl.liveTheYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
