package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.InventoryItem;
import byui.cit260.cityOfAaron.model.Map;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Point;
/**
 *
 * @author sterling
 */


public class MapControl {

    /* Algorithm for the createMap() method from assignment instructions
    public static Map createMap( int noOfRows,
            int noOfColumns,
            InventoryItem[] items) {
      if noOfRows < 0  OR numOfColumns < 0
       return null
      endif
      if items is null OR its length is < 1
       RETURN null
      endif
     Map map = new Map object
     save the noOfRows in the map
     save the noOfColumns in the map
     locations = createLocations(noOfRows, noOfColumns)
     Assign the locations array to the map
    **** scenes = createScenes() **** WE DON'T HAVE TO DO THESE
    **** questions = createQuestions() ****
    **** assignQuestionsToScenes() ****
    **** assignItemsToScenes() ****
    **** assignScenesToLocations() ****
     return map
    }
    */
    public static Map createMap(int noOfRows, int noOfColumns) {
        if(noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        Map map = new Map();
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        return map;
    }
    
    /* Algorithm for the createLocations() method from assignment instructions
     public static Location[][] createLocations(int rows, int columns) {
     IF rows < 1 OR columns < 1 THEN
      RETURN null 
     ENDIF
     locations = new two-dimensional Location array 
     FOR every row in the locations array
      FOR every column in the locations array
       location = create a new Location object
       set the row, and column attributes in the location
       set visited attribute to false
       Assign location to the row, and column in array
     ENDFOR
     RETURN locations
     }
    */
    private static Location[][] createLocations(int rows, int columns) {
        if(rows < 1 || columns < 1) {
            return null;
        }
    String[] defaultTips = {"Tip#1","Tip#2","Tip#3"};
    Location[][] locations = new Location[rows][columns];
/*    for(int r = 0;r < rows; r++) { // all of the default settings could be moved to a constructor
        for(int c = 0; c < columns; c++) {
            Location location = new Location();
            location.setDescription("default");
            location.setMapSymbol("*");
            location.setGameTips(defaultTips);
            locations[r][c] = location;
        }
    } */
    Location location = new Location("The Ruler's Court", "You are standing before the ruler's throne, surrounded by his guards.", "C", defaultTips);
    locations[0][0] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[0][1] = location;
    location = new Location("The River", "You are walking along the banks of a raging river.", "R", defaultTips);
    locations[0][2] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[0][3] = location;
    location = new Location("The Granary and Storehouse", "You are standing in a huge barn-like building full of grain.", "S", defaultTips);
    locations[0][4] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[1][0] = location;
    location = new Location("The Wheat Field", "You are standing in a field with wheat stretching as far as you can see", "W", defaultTips);
    locations[1][1] = location;
    location = new Location("The River", "You are walking along the banks of a raging river.", "R", defaultTips);
    locations[1][2] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[1][3] = location;
    location = new Location("Undeveloped Land", "You are hacking your way through thick jungle.", "J", defaultTips);
    locations[1][4] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[2][0] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[2][1] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[2][2] = location;
    location = new Location("The River", "You are walking along the banks of a raging river.", "R", defaultTips);
    locations[2][3] = location;
    location = new Location("The Temple", "You are standing before a beautiful temple.", "T", defaultTips);
    locations[2][4] = location;
    location = new Location("The Village", "You are standing in the middle of a quaint village.", "V", defaultTips);
    locations[3][0] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[3][1] = location;
    location = new Location("The Village", "You are standing in the middle of a quaint village.", "V", defaultTips);
    locations[3][2] = location;
    location = new Location("The Dangerous Road", "You are walking along a dark road cut through thick jungle.", "-", defaultTips);
    locations[3][3] = location;
    location = new Location("The River", "You are walking along the banks of a raging river.", "R", defaultTips);
    locations[3][4] = location;
    location = new Location("The Border", "Be careful! You are approaching the border of the Lamanite lands.", "B", defaultTips);
    locations[4][0] = location;
    location = new Location("The Border", "Be careful! You are approaching the border of the Lamanite lands.", "B", defaultTips);
    locations[4][1] = location;
    location = new Location("The Border", "Be careful! You are approaching the border of the Lamanite lands.", "B", defaultTips);
    locations[4][2] = location;
    location = new Location("The River", "You are walking along the banks of a raging river.", "R", defaultTips);
    locations[4][3] = location;
    location = new Location("The Border", "Be careful! You are approaching the border of the Lamanite lands.", "B", defaultTips);
    locations[4][4] = location;

    return locations;
    }    
}
