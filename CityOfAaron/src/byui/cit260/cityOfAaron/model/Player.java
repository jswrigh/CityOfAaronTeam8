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
public class Player implements Serializable {
    
    private String name;

    public Player() {
        // Empty Constructor for JavaBeans
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
}
