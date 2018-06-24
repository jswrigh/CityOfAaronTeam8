package byui.cit260.cityOfAaron.view;

/**
 *
 * @author kanderson
 */
public class MainMenuView extends ViewBase{
    
    
    //Constructor
    public MainMenuView(){
    }
    
    @Override
    protected String getMessage(){
        return    "Main Menu\n"
                + "---------\n"
                + "N - Start a New Game\n"
                + "L - Load a Saved Game\n"
                + "H - Help Menu\n"
                + "Q - Quit\n";
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
        
        inputs[0] = getUserInput("Please enter your choice.");
        
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
        switch(inputs[0].trim().toUpperCase()){
            case "N" :
                startNewGame();
                break;
            
            case "L" :
                loadSavedGame();
                break;
                
            case "H" :
                helpMenu();
                break;
                
            case "Q" :
                System.out.println("Thank you for playing. Goodbye!");
                // return false;
                System.exit(0); // We might change this later but at least the program ends.
        }
        
        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void startNewGame(){
        StartNewGameView view = new StartNewGameView();
        view.displayView();
    }
    
    private void helpMenu(){
        HelpMenuView view = new HelpMenuView();
        view.displayView();
    }
    
    private void loadSavedGame(){
        System.out.println("\nLoad Saved Game called. Implementation coming soon.\n");
    }
}
