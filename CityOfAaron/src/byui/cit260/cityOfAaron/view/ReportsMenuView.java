package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.InventoryItem;

/**
 *
 * @author kanderson
 */
public class ReportsMenuView extends ViewBase {
    
    // Constructor
    
    public ReportsMenuView() {
        
    }
    
    /**
     * Get the message that will be displayed by this view.
     * @return
     */
    
    @Override
    protected String getMessage(){
        
        return "Reports Menu\n"
                + "------------\n"
                + "A - Animals in the Storehouse\n"
                + "T - Tools in the Storehouse\n"
                + "P - Provisions in the Storehouse\n"
                + "W - Authors who wrote this Game\n"
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
        
        inputs[0] = getUserInput("What would you like to know about?");
        
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
                case "A" :                    
                    this.console.println("There are lots of animals.\n"); // should print actual values.
                    PrintReportView report = new PrintReportView();
                    report.reportItems = "Animals";
                    report.displayView();
                    break;

                case "T" :
                    this.console.println("There are lots of tools.\n"); // should print actual values.
                    break;

                case "P" :
                    InventoryItem[] items = new InventoryItem[3];
                    
                    for (InventoryItem item : items) {
                        
                    }
                    
                    
                    this.console.println("There are lots of provisions.\n"); // should print actual values.
                     break;

                case "W" :
                    this.console.println("Sterling, Jacob, and Charlot wrote this!\n"); // should print values from variables.
                    break;            

                case "X" :
                    return false;
            }
            // Help text will scroll above menu so let's pause for a few seconds first.
            pause(3000);

            // return false if you want this view to exit and return
            // to the view that called it.        
            return true;
    }    
}