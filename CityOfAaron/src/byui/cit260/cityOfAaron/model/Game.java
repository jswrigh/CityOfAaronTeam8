package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Jacob
 */
public class Game implements Serializable {
    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;
    private int currentYear;
    private int currentFoodAllocation;
    private int currentPlantingAllocation;
    private int currentTithingPercentage;

    public Game() {
        // Empty Constructor for JavaBeans
    }    
    
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStorage() {
        return wheatInStorage;
    }

    public void setWheatInStorage(int wheatInStorage) {
        this.wheatInStorage = wheatInStorage;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getCurrentFoodAllocation() {
        return currentFoodAllocation;
    }

    public void setCurrentFoodAllocation(int currentFoodAllocation) {
        this.currentFoodAllocation = currentFoodAllocation;
    }

    public int getCurrentPlantingAllocation() {
        return currentPlantingAllocation;
    }

    public void setCurrentPlantingAllocation(int currentPlantingAllocation) {
        this.currentPlantingAllocation = currentPlantingAllocation;
    }

    public int getCurrentTithingPercentage() {
        return currentTithingPercentage;
    }

    public void setCurrentTithingPercentage(int currentTithingPercentage) {
        this.currentTithingPercentage = currentTithingPercentage;
    }

    
    @Override
    public String toString() {
        return "Game {" 
                + "thePlayer=" + thePlayer 
                + ", theMap=" + theMap 
                + ", theStorehouse=" + theStorehouse 
                + ", currentPopulation=" + currentPopulation 
                + ", acresOwned=" + acresOwned 
                + ", wheatInStorage=" + wheatInStorage 
                + ", currentYear=" + currentYear 
                + ", currentFoodAllocation=" + currentFoodAllocation
                + ", currentPlantingAllocation=" + currentPlantingAllocation
                + ", currentTithingPercentage=" + currentTithingPercentage
                + '}';
    }  
}
