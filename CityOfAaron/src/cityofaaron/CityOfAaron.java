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




/**
 *
 * @author sterling
 */
public class CityOfAaron {

        public static Game currentGame = null;

        public static Game getCurrentGame(){
            return currentGame;
        }

        public static void setCurrentGame(Game game){
            currentGame = game;
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            try {
                View startProgramView = new StartProgramView();
                startProgramView.displayView();
            } catch(Throwable te){
                System.out.println(te.getMessage());
                te.printStackTrace();
            }
        }
}
