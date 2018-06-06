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
import byui.cit260.cityOfAaron.model.Author;
import byui.cit260.cityOfAaron.model.InventoryItem;
import byui.cit260.cityOfAaron.model.ItemType;
import byui.cit260.cityOfAaron.model.Condition;
import byui.cit260.cityOfAaron.model.Location;

import byui.cit260.cityOfAaron.view.StartProgramView;




/**
 *
 * @author sterling
 */
public class CityOfAaron {

    public static Game currentGame = null;
    
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game game){
        currentGame = game;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayView();

        /*
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);
        
        System.out.println(theGame.toString());
        
        
        InventoryItem theInventoryItem = new InventoryItem();
        theInventoryItem.setItemType(ItemType.Animal);
        theInventoryItem.setCondition(Condition.Good);
        theInventoryItem.setQuantity(10);
        
        System.out.println(theInventoryItem.toString());
        
        
        Author testAuthor = new Author();
        testAuthor.setName("Mr. Author");
        testAuthor.setTitle("Big Cheese");
        
        System.out.println(testAuthor.toString());
        
        
        Location theLocation = new Location();
        theLocation.setName("Test Location");
        theLocation.setDescription("Test Description");
        theLocation.setMapSymbol("Test Name");
        // theLocation.setGameTips();
        
        System.out.println(theLocation.toString());
        
        
        Storehouse theStorehouse = new Storehouse();
        // theStorehouse.setAuthors();
        // theStorehouse.setAnimals();
        // theStorehouse.setTools();
        // theStorehouse.setProvisions();
       
        
        System.out.println(theStorehouse.toString());

        */
    }
}
