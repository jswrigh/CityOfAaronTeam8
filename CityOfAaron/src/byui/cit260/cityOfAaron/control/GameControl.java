package byui.cit260.cityOfAaron.control;

import java.io.Serializable;
import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.exceptions.GameControlException;
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
    public static void createNewGame (Player player) throws GameControlException {
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

        items = createItems(ItemType.Animal);
        animals[0] = (Animal)(items[0]);
        animals[0].setName("Horse");
        animals[0].setAge(5);
        animals[1] = (Animal)(items[1]);
        animals[0].setName("Elephant");
        animals[0].setAge(92);
        storehouse.setAnimals(animals);

        items = createItems(ItemType.Provisions);
        provisions[0] = (Provision)(items[0]);
        provisions[0].setName("Oil Lamp");
        provisions[0].setPerishable(false);
        provisions[1] = (Provision)(items[1]);
        provisions[0].setName("Fruit");
        provisions[0].setPerishable(true);
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

    public static InventoryItem[] createItems(ItemType itemType) {
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
        switch(itemType) {
            case Animal :
                items[0] = new InventoryItem();
                items[0].setItemType(ItemType.Animal);
                items[0].setQuantity(3);
                items[0].setCondition(Condition.Good);
                items[1] = new InventoryItem();
                items[1].setItemType(ItemType.Animal);
                items[1].setQuantity(2);
                items[1].setCondition(Condition.Poor);
                break;
            case Tool :
                for(int i=0; i<items.length; i++) { // create objects
                    items[i] = new InventoryItem();
                }
                items[0].setItemType(ItemType.Tool);
                items[0].setQuantity(3);
                items[0].setCondition(Condition.Good);
                items[1].setItemType(ItemType.Tool);
                items[1].setQuantity(2);
                items[1].setCondition(Condition.Poor);
                break;
            case Provisions :
                items[0] = new InventoryItem(ItemType.Provisions, 3, Condition.Good);
                break;
        }    
        return items;
    }
       
    public static int loadGame(String fileName) {
        return 0;
    }
    
    public static int saveGame(String fileName) {
        return 0;
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
        Game game = new Game();
        int finalRating = 0;
        game = CityOfAaron.getCurrentGame();
        System.out.print("Living year ");
        int currentYear = game.getCurrentYear();
        System.out.println(currentYear);
        if(currentYear > GameConstants.YEARS_TO_PLAY) {
            try {
                 finalRating = calculateRating(game.getWheatInStorage(), GameConstants.INITIAL_WHEAT_IN_STORE, game.getCurrentPopulation(), GameConstants.INITIAL_POPULATION);
            } catch (GameControlException ge) {
                 System.out.println(ge.getMessage());
            }
            return finalRating;
        }
        game.setCurrentYear(++currentYear);
        return 0;
    }
}
