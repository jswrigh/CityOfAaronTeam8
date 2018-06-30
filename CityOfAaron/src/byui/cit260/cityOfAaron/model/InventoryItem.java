/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;
/**
 *
 * @author sterling
 */
public class InventoryItem implements Serializable{
    
    private ItemType itemType;
    private int quantity;
    private Condition condition;

    public InventoryItem() {
    }

    public InventoryItem(ItemType newItemType, int newQuantity, Condition newCondition){
        this.itemType = newItemType;
        this.quantity = newQuantity;
        this.condition = newCondition;
    }
    
    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    @Override
    public String toString() {
        return "InventoryItem{" + "itemType=" + itemType + ", quantity=" + quantity + ", condition=" + condition + '}';
    }
    
}
