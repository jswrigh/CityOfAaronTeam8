/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.Map;
import byui.cit260.cityOfAaron.model.Location;
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
  return null;
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
  return null;
 }    
}
