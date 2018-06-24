package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.control.CropControl;
/**
 *
 * @author kanderson
 */
public class ManageCropsMenuView extends ViewBase {
    
    //Constructor
    public ManageCropsMenuView(){
        
    }
    
    @Override
    protected String getMessage(){
        
        return "Crops Menu\n"
                + "----------\n"
                + "B - Buy Land\n"
                + "S - Sell Land\n"
                + "F - Feed the People\n"
                + "P - Plant Crops\n"
                + "O - Pay Tithes and Offerings\n"
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
                case "B" :
                    CropControl.buyLand(100); // temp value. Should prompt user.
                    break;

                case "S" :
                    CropControl.sellLand(100); // temp value. Should prompt user.
                    break;

                case "F" :
                    CropControl.feedPeople(100); // temp value. Should prompt user.
                     break;

                case "P" :
                    CropControl.plantCrops(100); // temp value. Should prompt user.
                    break;            

                case "O" :
                    CropControl.payTithesAndOfferings(100); // temp value. Should prompt user.
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
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean someActionHandler(){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        return true;
    }
}
