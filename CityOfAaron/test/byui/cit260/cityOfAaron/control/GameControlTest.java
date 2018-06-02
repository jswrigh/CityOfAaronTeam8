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
        String playerName = "Bob";
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
        String fileName;
        fileName = "Mygame";
        int expResult = -1; // change to 0 once reading and writing work
        int result = GameControl.loadGame(fileName);
        assertEquals(expResult, result);
    }
}
