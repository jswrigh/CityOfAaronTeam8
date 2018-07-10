package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.MapControlException;
import byui.cit260.cityOfAaron.model.InventoryItem;
import byui.cit260.cityOfAaron.model.Map;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Point;
/**
 *
 * @author sterling
 */


public class MapControl {
    public static Map createMap(int noOfRows, int noOfColumns) throws MapControlException {
        if(noOfRows < 0 || noOfColumns < 0) {
            throw new MapControlException("Map rows and columns cannot be less than 0.");
        }
        Map map = new Map();
        Location[][] locations = new Location[noOfRows][noOfColumns];
        locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        return map;
    }
    
    private static Location[][] createLocations(int rows, int columns) throws MapControlException {
        if(rows < 1 || columns < 1) {
            throw new MapControlException("Map rows and columns cannot be less than 0.");
        }
    String[] defaultTips = {"Tip#1","Tip#2","Tip#3"};
    Location[][] locations = new Location[rows][columns];
    for(int r = 0;r < rows; r++) { // all of the default settings could be moved to a constructor
        for(int c = 0; c < columns; c++) {
            Location location = new Location();
            location.setDescription("default");
            location.setMapSymbol("*");
            location.setGameTips(defaultTips);
            locations[r][c] = location;
        }
    }
    locations[2][2].setMapSymbol("$");
    return locations;
    }    
}
