package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @authors Sterling and Jacob
 */
public abstract class ViewBase implements View {
    
    /**
     * Constructor
     */
    public ViewBase(){
    }
    
        
    /**
     * Get the message to be displayed
     */
    protected abstract String getMessage();
    
    /**
     * * Get inputs from the user
     */
    protected abstract String[] getInputs();
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public abstract boolean doAction(String[] inputs);

    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            String message = getMessage();
            if (message != null) {
                System.out.println(getMessage());
            }
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    protected static void pause(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception){
            // do nothing
        }
    }
}
