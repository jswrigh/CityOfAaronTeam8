package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class StartProgramView extends ViewBase {
    
    //  Constructor
    public StartProgramView(){
        super();
    }
    
    /**
     * The message that will be displayed by this view.
     */
    protected String getMessage(){
        return "Welcome to the city of Aaron. You have been summoned here by the High Priest to\n" +
                    "assume your role as ruler of the city. Your responsibility is to buy and sell land,\n" +
                    "determine how much wheat to plant each year and how much to set aside to feed your\n" +
                    "people. In addition, it will be your job to pay an annual tithe on the wheat that is\n" +
                    "harvested. If you fail to provide enough wheat for the people, people will starve, some\n" +
                    "people will die, and your workforce will be diminished. Plan carefully. And Oh, there is\n" +
                    "always a danger of rats eating your wheat.\n";
    }
            
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        return null;
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
        
        // return false if you want this view to exit and return
        // to the view that called it.
        startMainMenuView();
        
        return false;
    }
    
    private void startMainMenuView(){
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}