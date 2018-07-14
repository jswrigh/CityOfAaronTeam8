/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sterling
 */
public class LoadGameView extends ViewBase {
    
        /**
     * Constructor
     */
    public LoadGameView(){
    }
        

        /**
     * Get the message that will be displayed by this view.
     * @return
     */
    @Override
    protected String getMessage(){
        
        return    ""; // not needed or this view
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
        
        inputs[0] = getUserInput("Enter file name:");
        
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
        try {
            // Act on the user's input.
            // This is a "dispatch" function that decides what
            // other functions to call. You can use an if-, if-else,
            // or switch statement.

            GameControl.loadGame(inputs[0]);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error retrieving game from file: " + ex.getMessage());
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error retrieving game from file: " + ex.getMessage());
        }
    
        // return false if you want this view to exit and return
        // to the view that called it.        
        return false;
    }

}
