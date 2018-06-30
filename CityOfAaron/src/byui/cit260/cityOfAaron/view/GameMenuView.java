package byui.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Map;

/**
 *
 * @author kanderson
 */
public class GameMenuView extends ViewBase{
    
    /**
     * Constructor
     */
    public GameMenuView(){
    }
    
    /**
     * Get the message that will be displayed by this view.
     */
    @Override
    protected String getMessage(){
        return    "Game Menu\n"
                + "---------\n"
                + "V - View the map\n"
                + "M - Move to a new location\n"
                + "C - Manage the crops\n"
                + "L - Live the year\n"
                + "R - Run reports\n"
                + "S - Save the current game\n"
                + "X - Back to Main Menu\n";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("What would you like to do?");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
    // Act on the user's input.
    // This is a "dispatch" function that decides what
    // other functions to call. You can use an if-, if-else,
    // or switch statement.
        switch(inputs[0].trim().toUpperCase()){
                case "V" :
                    viewTheMap();
                    break;

                case "M" :
                    System.out.println("Soon you will be able to move to a new location!\n");
                    break;

                case "C" :
                    ManageCropsMenuView manageCropsMenu = new ManageCropsMenuView();
                    manageCropsMenu.displayView();
                    break;

                case "L" :
                    GameControl.liveTheYear();
                    break;            

                case "R" :
                    ReportsMenuView reportsMenu = new ReportsMenuView();
                    reportsMenu.displayView();
                    break;

                case "S" :
                    GameControl.saveGame("mygame.txt");
                    break;

                case "X" :
                    return false;
            }
            // Text will scroll above menu so let's pause for a few seconds first.
            pause(2000);
            
            // return false if you want this view to exit and return
            // to the view that called it.        
            return true;
        }
/* Algorithm for the viewTheMap method from assignment instructions
public void displayMap(){
 game = get the currentGame from the main class
 locations = get the 2-D locations array from the map
 Print the title
 Print the column numbers for each column
 for every row in map
  Print a row divider
  Print the row number on a new line
  for every column in the row
   Print a column divider
   location = locations[row][column]
   if location has been visited
    Get the mapSymbol for the scene in this location
    Print the mapSymbol
   else
    Print " ?? "
   endif
  endFor
  Print the ending column divider
 endFor
 Print the ending row divider 
}
*/

    public void viewTheMap(){ //displaying it here for now instead of creating separate view
        Game game = CityOfAaron.getCurrentGame();
        Map map = game.getTheMap();
        Location[][] locations = map.getLocations();
        Location location;
        System.out.print("Here is the map.\n");
        System.out.print    ("  1 2 3 4 5 \n");
        for(int r = 0; r < locations.length; r++) {
            System.out.print("-----------\n");
            System.out.print(r+1+"|");
            for(int c = 0; c < locations.length; c++) {
                location=locations[r][c];
                if(location.getVisited()) {
                    System.out.print(location.getMapSymbol());
                } else {
                    System.out.print("?");
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }
        System.out.print("-----------\n");       
    }
}
