/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.Game;
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
        String playerName = "Bob";
        Game game = new Game();
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.startGame(playerName, game);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        String fileName = "GameFile.txt";
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.saveGame(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadGame method, of class GameControl.
     */
    @Test
    public void testLoadGame() {
        System.out.println("loadGame");
        String fileName = "GameFile.txt";
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.loadGame(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveReport method, of class GameControl.
     */
    @Test
    public void testSaveReport() {
        System.out.println("saveReport");
        String fileName = "MyReport.txt";
        String report = "This is my report.";
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.saveReport(fileName, report);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateRating method, of class GameControl.
     */
    @Test
    public void testCalculateRatingCase1() {
        System.out.println("calculateRating Case 1");
        int currentInventory = 6000;
        int startInventory = 2700;
        int population = 1260;
        int startPopulation = 100;
        int expResult = 24;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateRatingCase2() {
        System.out.println("calculateRating Case 2");
        int currentInventory = -1;
        int startInventory = 2700;
        int population = 1260;
        int startPopulation = 100;
        int expResult = -1;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateRatingCase3() {
        System.out.println("calculateRating Case 3");
        int currentInventory = 6000;
        int startInventory = 2700;
        int population = -1;
        int startPopulation = 100;
        int expResult = -1;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateRatingCase4() {
        System.out.println("calculateRating Case 4");
        int currentInventory = 6000;
        int startInventory = 2700;
        int population = 1;
        int startPopulation = 100;
        int expResult = 0;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateRatingCase5() {
        System.out.println("calculateRating Case 5");
        int currentInventory = 1;
        int startInventory = 2700;
        int population = 10260;
        int startPopulation = 100;
        int expResult = 202;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateRatingCase6() {
        System.out.println("calculateRating Case 6");
        int currentInventory = 1000000;
        int startInventory = 2700;
        int population = 0;
        int startPopulation = 100;
        int expResult = 367;
        int result = GameControl.calculateRating(currentInventory, startInventory, population, startPopulation);
        assertEquals(expResult, result);
    }

    /**
     * Test of liveTheYear method, of class GameControl.
     */
    @Test
    public void testLiveTheYear() {
        System.out.println("liveTheYear");
        Game game = null;
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.liveTheYear(game);
    }
}
