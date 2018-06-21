package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

import byui.cit260.cityOfAaron.model.*;
import cityofaaron.*;
import byui.cit260.cityOfAaron.view.GameMenuView;

/**
 *
 * @author kanderson
 */
public class StartNewGameView extends ViewBase {   
     /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public StartNewGameView(){
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
            System.out.println("No player name entered. Returning to the main menu.");
            return false;
        }
        
        String playerName = inputs[0];
        createAndStartGame(playerName);
        
        return false;
    }
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void createAndStartGame(String playerName){
        
        // Eventually you will do this: 
        // Game game = GameControl.createNewGame(playerName);
        // But for this week:
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game();
        game.setThePlayer(player);
        
        CityOfAaron.setCurrentGame(game);
        
        System.out.println("");
        System.out.println("Welcome to the game," + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n");
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayView();
    }

    @Override
    protected String getMessage() {
        return "";
    }
}
