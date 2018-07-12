package byui.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Map;
import byui.cit260.cityOfAaron.exceptions.GameControlException;

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
        try {
            switch(inputs[0].trim().toUpperCase()){
                    case "V" :
                        viewTheMap();
                        break;

                    case "M" :
                        this.console.println("Soon you will be able to move to a new location!\n");
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
                        SaveGameView saveGameMenu = new SaveGameView();
                        saveGameMenu.displayView();
                        break;

                    case "X" :
                        return false;
                }
        } catch (GameControlException ge) {
                ErrorView.display(this.getClass().getName(), "Error processing menu selection: " + ge.getMessage());
                return false;
        }
            // Text will scroll above menu so let's pause for a few seconds first.
            pause(2000);
            
            // return false if you want this view to exit and return
            // to the view that called it.        
            return true;
        }


    public void viewTheMap(){ //displaying it here for now instead of creating separate view
        Game game = CityOfAaron.getCurrentGame();
        Map map = game.getTheMap();
        Location[][] locations = map.getLocations();
        Location location;
        this.console.print("Here is the map.\n");
        this.console.print    ("  1 2 3 4 5 \n");
        for(int r = 0; r < locations.length; r++) {
            this.console.print("-----------\n");
            this.console.print(r+1+"|");
            for(int c = 0; c < locations.length; c++) {
                location=locations[r][c];
                this.console.print(location.getMapSymbol());
                this.console.print("|");
            }
            this.console.print("\n");
        }
        this.console.print("-----------\n");       
    }
}
