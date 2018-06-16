/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

import java.io.Serializable;
import byui.cit260.cityOfAaron.model.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author sterling
 */
public class GameControl {
    
    public static int startGame(String playerName) {
        try {
            Game game = new Game();
            game.setThePlayer(new Player());
//            make this work: game.player.setName(playerName);
//            also create actor here   
            game.setTheMap(new Map());
            /* The next lines depend on model classes that haven't been built yet
            game.setTheWheat(new Wheat());
            game.setTheLand(new Land());
            game.setThePopulation(new Population());
            */
        } catch (Exception ex) {
            return -1;
        }
        return 0;
    }
       
    public static int loadGame(String fileName) {
        try {
            try (FileInputStream fileInput = new FileInputStream(new File(fileName)); 
                ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
                
                // Read objects
                Game game = (Game) objectInput.readObject();
                Player player = (Player) objectInput.readObject();
//                Actor player.actor = (Actor) objectInput.readObject();
                Map map = (Map) objectInput.readObject();
//                Wheat wheat = (Wheat) objectInput.readObject();
//                Land land = (Land) objectInput.readObject();
//                Population population = (Population) objectInput.readObject();
                
                // Write to console during development
                System.out.println (game.toString());
                System.out.println (player.toString());
//                System.out.println (player.actor.toString);
                System.out.println (map.toString());
//                System.out.println (wheat.toString());
//                System.out.println (land.toString());
//                System.out.println (population.toString());
                
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found");
            return -1;
        } catch (IOException exception) {
            System.out.println("Error initializing stream");
            return -1;
        } catch (ClassNotFoundException exception) {
            System.out.println("Class not found");
            return -1;
        }
    return 0;
    }
    
        public static int saveGame(String fileName) {
        
        /*
        try {
            try (FileOutputStream fileOutput = new FileOutputStream(new File(fileName)); 
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
                
                // Write objects
                objectOutput.writeObject(game);
                objectOutput.writeObject(player);
//                objectOutput.readObject(player.actor);
                objectOutput.writeObject(map);
//                objectOutput.writeObject(wheat);
//                objectOutput.writeObject(land);
//                objectOutput.writeObject(population);
                
                // Write to console during development
                System.out.println (game.toString());
                System.out.println (player.toString());
//                System.out.println (player.actor.toString);
                System.out.println (map.toString());
//                System.out.println (wheat.toString());
//                System.out.println (land.toString());
//                System.out.println (population.toString());
                
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found");
            return -1;
        } catch (IOException exception) {
            System.out.println("Error initializing stream");
            return -1;
        } catch (ClassNotFoundException exception) {
            System.out.println("Class not found");
            return -1;
        }
        */
        
    return 0;
    }
        
   int calculateRating(int currentInventory, int startInventory, int population, int startPopulation) {
        System.out.println("Calculating the rating...");
        return 0;
   }
   
   static public int liveTheYear() {
       System.out.println("Living the year...");
       return 0;
   }
   
}
