package byui.cit260.cityOfAaron.control;

import java.io.Serializable;
import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.exceptions.GameControlException;
import byui.cit260.cityOfAaron.exceptions.MapControlException;
import byui.cit260.cityOfAaron.view.ErrorView;
import cityofaaron.CityOfAaron;
import cityofaaron.GameConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sterling
 */
public class GameControl {
    
/* basic algorithm for the method based on instructions
 public static int createNewGame(Player player) {
  if (player == null)
   return -1
  game = create a new Game object
  Save a reference to the Player object in the game
  Save a reference to the game in the main class
  **** actors = createActors() WE DON'T HAVE TO DO THIS ****
  **** Save the list of actors in the Game object ****
  **** Assign an actor to the player ****
  items = createItems()
  Save the list of items in the game
  map = createMap(noOfRows, noOfColumns, items)
  IF map == null THEN
   RETURN -1
  ENDIF
  Assign the map to the game
  RETURN 1 // indicates success }
 */
    public static void createNewGame (Player player) throws GameControlException, MapControlException {
        if (player == null) {
            throw new GameControlException("Cannot create new game without a valid player.");
        }
        Game game = new Game();
        CityOfAaron.setCurrentGame(game);
        game.setThePlayer(player);
        game.setCurrentYear(GameConstants.INITIAL_YEAR);
        game.setCurrentPopulation(GameConstants.INITIAL_POPULATION);
        game.setAcresOwned(GameConstants.INITIAL_ACRES);
        game.setWheatInStorage(GameConstants.INITIAL_WHEAT_IN_STORE);

        Storehouse storehouse = new Storehouse();
        Animal[] animals = new Animal[2];
        Provision[] provisions = new Provision[2];
        InventoryItem[] items = new InventoryItem[2];

        for(int i=0; i<animals.length; i++) { // create animal objects
            animals[i] = new Animal();
        }

        for(int i=0; i<provisions.length; i++) { // create provision objects
            provisions[i] = new Provision();
        }
        for(int i=0; i<items.length; i++) { // create tool objects
            items[i] = new InventoryItem();
        }

        animals[0].setItemType(ItemType.Animal);
        animals[0].setQuantity(3);
        animals[0].setCondition(Condition.Good);
        animals[0].setName("Horse");
        animals[0].setAge(5);
        animals[1].setItemType(ItemType.Animal);
        animals[1].setQuantity(1);
        animals[1].setCondition(Condition.Fair);
        animals[1].setName("Elephant");
        animals[1].setAge(92);
        storehouse.setAnimals(animals);

        provisions[0].setItemType(ItemType.Provisions);
        provisions[0].setQuantity(3);
        provisions[0].setCondition(Condition.Good);
        provisions[0].setName("Oil Lamp");
        provisions[0].setPerishable(false);
        provisions[1].setItemType(ItemType.Provisions);
        provisions[1].setQuantity(3);
        provisions[1].setCondition(Condition.Good);
        provisions[1].setName("Fruit");
        provisions[1].setPerishable(true);
        storehouse.setProvisions(provisions);

        items = createItems(ItemType.Tool);
        storehouse.setTools(items); // we just use items as tools after populating the subclasses

        game.setTheStorehouse(storehouse);

        Map map = MapControl.createMap(5, 5);
            if(map==null){
                throw new GameControlException("Map cannot be empty.");
            }
        game.setTheMap(map);
    }

    public static InventoryItem[] createItems(ItemType itemType) throws GameControlException {
        /* algorithm for this method based on instructions
        public static InventoryItem createItems() {
         items = create an array InventoryItem objects
         item1 = new InventoryItem object
         Assign values to each attribute in the InventoryItem object
         Assign items1 to a position in the items array
         item2 = new InventoryItem object
         Assign values to each attribute in the InventoryItem object
         Assign items2 to a position in the items array
         …
         …
         RETURN items
        }
        */
        InventoryItem[] items = new InventoryItem[2];
        items[0] = new InventoryItem();
        items[0].setItemType(ItemType.Tool);
        items[0].setQuantity(3);
        items[0].setCondition(Condition.Good);
        items[1] = new InventoryItem();
        items[1].setItemType(ItemType.Tool);
        items[1].setQuantity(2);
        items[1].setCondition(Condition.Poor);
        return items;
    }
       
    public static void loadGame(String fileName) throws GameControlException, IOException {
        Game game = null;
        if (game==null || fileName.length() < 1 || fileName == null) {
            throw new GameControlException("Invalid file operation.");
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            try {
                game = (Game) in.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Class not found error: " + ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
        CityOfAaron.setCurrentGame(game);
    }
    
    public static void saveGame(String fileName) throws GameControlException, IOException {
        Game game = CityOfAaron.getCurrentGame();
        if (game==null || fileName.length() < 1 || fileName == null) {
            throw new GameControlException("Invalid file operation.");
        }
        System.out.println("Saving Game...");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(game);
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
        
    static int calculateRating(int currentInventory, int startInventory, int population, int startPopulation) throws GameControlException {
        if(currentInventory < 0 || population < 0) {
            throw new GameControlException("Curent inventory or population can't be less than zero.");
        }
        if(startInventory <= 0 || startPopulation <= 0) {
            throw new GameControlException("Starting population can't be less than zero.");
        }
        float populationGrowth = (float) (population-startPopulation)/startPopulation;
        float inventoryGrowth = (float) (currentInventory-startInventory)/startInventory;
        int finalRating = Math.round(populationGrowth*2 + inventoryGrowth);
        if(finalRating < 0) finalRating = 0;
        return finalRating;
    }
   
    static public int liveTheYear() throws GameControlException {
//    static int liveTheYear() {
        int finalRating = 0;
        Game game = CityOfAaron.getCurrentGame();
        System.out.print("Living year ");
        int currentYear = game.getCurrentYear();
        System.out.println(currentYear);
        if(currentYear > GameConstants.YEARS_TO_PLAY) {
            try {
                finalRating = calculateRating(game.getWheatInStorage(), GameConstants.INITIAL_WHEAT_IN_STORE, game.getCurrentPopulation(), GameConstants.INITIAL_POPULATION);
            } catch (GameControlException ge) {
//                 ErrorView.display(this.getClass().getName(), "Error calculating rating: " + ge.getMessage());
                System.out.println(ge.getMessage());

            }
            return finalRating;
        }
        game.setCurrentYear(++currentYear);
        return 0;
    }
}
