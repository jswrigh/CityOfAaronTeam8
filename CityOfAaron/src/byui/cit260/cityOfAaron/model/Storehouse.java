/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Jacob
 */
public class Storehouse implements Serializable {
    private Author authors;
    private InventoryItem animals;
    private InventoryItem tools;
    private IventoryItem provisions;
    
    
    public Storehouse() {
        // Empty Constructor for JavaBeans
    }
    

}
