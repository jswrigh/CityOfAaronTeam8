package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

import byui.cit260.cityOfAaron.model.*;
import cityofaaron.*;
import byui.cit260.cityOfAaron.view.GameMenuView;
import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.exceptions.GameControlException;
import byui.cit260.cityOfAaron.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author kanderson
 */
public class StartNewGameView extends ViewBase {   

    /**
     * Constructor
     */
    public StartNewGameView(){
        super();
    }    
    
    @Override
    protected String getMessage() {
        return ""; // required to implement abstract method, even though it isn't used in this instance.
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
        
        inputs[0] = getUserInput("Please enter your name, or press Enter to return to the main menu.", true);
        
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
        
        // If the user just hit Enter then bail out without doing the action
        if(inputs[0] == null || inputs[0].equals("")){
            this.console.println("No player name entered. Returning to the main menu. \n");
            return false;
        }
        
        String playerName = inputs[0];
        try {
            createAndStartGame(playerName);
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error creating map: " + ex.getMessage());
        }
        
        return false;
    }
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void createAndStartGame(String playerName) throws MapControlException{
        
        // Eventually you will do this: 
        // Game game = GameControl.createNewGame(playerName);
        // But for this week:
        
        Player player = new Player();
        player.setName(playerName);
        
        try {
            GameControl.createNewGame(player);
        } catch (GameControlException ex) {
                ErrorView.display(this.getClass().getName(), "Error processing crop menu input: " + ex.getMessage());
        }
        
        this.console.println("");
        this.console.println("Welcome to the game," + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n");
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayView();
    }
}
