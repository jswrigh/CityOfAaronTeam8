/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.control.GameControl;
import byui.cit260.cityOfAaron.exceptions.GameControlException;
import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.model.InventoryItem;
import byui.cit260.cityOfAaron.model.Animal;
import byui.cit260.cityOfAaron.model.Storehouse;
import cityofaaron.CityOfAaron;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sterling
 */
public class PrintReportView extends ViewBase {

    String reportItems;
//    String[] reportHeadings;
    
        /**
     * Constructor
     */
    public PrintReportView(){
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
        this.console.println("To save the report, enter a valid file name. Remember it so you can retrieve it later!");
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
    public boolean doAction(String[] inputs) {
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        try {
            this.saveReport(inputs[0]);
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error saving game to file: " + ex.getMessage());
        }

        this.console.println("File successfully saved at " + inputs[0]);
        // return false if you want this view to exit and return
        // to the view that called it.        
        return false;
    }

    @Override
    protected String getMessage() {
        return null;
    }

    public void saveReport(String fileName) throws IOException {
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        ArrayList<String> rowStrings = new ArrayList<String>();
        ArrayList<String> headings = new ArrayList<String>();
        
        switch (reportItems) {
            case "Animals":                
                Animal rowObject[] = new Animal[storehouse.getAnimals().length];
                rowObject = storehouse.getAnimals();
                headings.add("  Quantity |");
                headings.add("  Name     |");
                headings.add("  Type     |");
                headings.add("  Age      |");
                headings.add(" Condition|");
                for(int i=0;i<rowObject.length;i++){
                    rowStrings.add(String.valueOf(rowObject[i].getQuantity())+"|");
                    rowStrings.add(rowObject[i].getName()+"|");
                    rowStrings.add(rowObject[i].getItemType().toString()+"|");
                    rowStrings.add(String.valueOf(rowObject[i].getAge())+"|");
                    rowStrings.add(rowObject[i].getCondition().toString()+"|\n");
                }
            break;
            case "Tools":                
                InventoryItem toolObject[] = new InventoryItem[storehouse.getTools().length];
                toolObject = storehouse.getTools();
                headings.add("  Quantity |");
                headings.add("  Type     |");
                headings.add(" Condition|");
                for(int i=0;i<toolObject.length;i++){
                    rowStrings.add(String.valueOf(toolObject[i].getQuantity())+"|");
                    rowStrings.add(toolObject[i].getItemType().toString()+"|");
                    rowStrings.add(toolObject[i].getCondition().toString()+"|\n");
                }
            break;
            }
        
        while (game==null || fileName.length() < 1 || fileName == null) {
            this.console.println("Try again. Please enter a valid file name.");
        }
        try (PrintWriter out = new PrintWriter(fileName)){
            out.write(reportItems + "\n\n");
            for(int i=0; i< headings.size(); i++) {
                out.write(headings.get(i));
            }
            out.write("\n");

            for(int i=0; i< rowStrings.size(); i++) {
                out.format("%1$12s",rowStrings.get(i));
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }

}
