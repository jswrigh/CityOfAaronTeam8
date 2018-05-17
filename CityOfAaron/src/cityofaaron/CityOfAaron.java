/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.Storehouse;
import byui.cit260.cityOfAaron.model.Map;

/**
 *
 * @author sterling
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);

        System.out.println(theGame.toString());
    }
    
}
