/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.Storehouse;
import byui.cit260.cityOfAaron.model.Map;
import byui.cit260.cityOfAaron.model.Author;
import byui.cit260.cityOfAaron.model.InventoryItem;
import byui.cit260.cityOfAaron.model.ItemType;
import byui.cit260.cityOfAaron.model.Condition;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.view.View;

import byui.cit260.cityOfAaron.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author sterling
 */
public class CityOfAaron {

        private static Game currentGame = null;
        
        private static PrintWriter outFile = null;
        private static BufferedReader inFile = null;
        private static PrintWriter logFile = null;
        
        public static Game getCurrentGame(){
            return currentGame;
        }

        public static void setCurrentGame(Game game){
            currentGame = game;
        }

        public static PrintWriter getOutFile() {
            return outFile;
        }

        public static void setOutFile(PrintWriter outFile) {
            CityOfAaron.outFile = outFile;
        }

        public static BufferedReader getInFile() {
            return inFile;
        }

        public static void setInFile(BufferedReader inFile) {
            CityOfAaron.inFile = inFile;
        }

        public static PrintWriter getLogFile() {
            return logFile;
        }

        public static void setLogFile(PrintWriter logFile) {
            CityOfAaron.logFile = logFile;
        }

        
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            try {
                // open character stream files for user input and output
                CityOfAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
                CityOfAaron.outFile = new PrintWriter(System.out, true);
                
                logFile = new PrintWriter("logFile.txt");
                
                // create StartProgramView and start the program
                View startProgramView = new StartProgramView();
                startProgramView.displayView();
            } catch(Throwable te){
                System.out.println(te.getMessage());
                te.printStackTrace();
            }
            finally {
                try {
                    CityOfAaron.inFile.close();
                    if(logFile != null) {
                        logFile.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Error closing files");
                }
                CityOfAaron.outFile.close();
            }
        }
}
