package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Jacob
 */
public class Location implements Serializable {
    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;
    
    public Location() {
        // Empty Constructor for JavaBeans
    }

    public Location(String name, String description, String mapSymbol, String[] gameTips) {
        this.name = name;
        this.description = description;
        this.mapSymbol = mapSymbol;
        this.gameTips = gameTips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String[] getGameTips() {
        return gameTips;
    }

    public void setGameTips(String[] gameTips) {
        this.gameTips = gameTips;
    }

    @Override
    public String toString() {
        return "Location{" 
                + "name=" + name 
                + ", description=" + description 
                + ", mapSymbol=" + mapSymbol 
                + ", gameTips=" + gameTips + '}';
    }
}
