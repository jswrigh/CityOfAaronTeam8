/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.control;

/**
 *
 * @author sterling
 */
public class CropControl {
    
    //calcHarvest(offerings,previousCropYield,acres):double
    public static int harvestCrops(int offerings, int previousCropYield, int acres) {
        int yield = 0;
        if (offerings < 0) {
            return -1;
        }
        if (previousCropYield < 0) {
            return -1;
        }
        if (acres < 0) {
            return -1;
        }
        if (offerings < .08*previousCropYield) {
            yield = randomInt(1,3);
        }
        if (offerings >= .08*previousCropYield && offerings <= .12*previousCropYield) {
            yield = randomInt(2,4);
        }
        if (offerings > .12*previousCropYield) {
            yield = randomInt(2,5);
        }
        return yield*acres;
    }
    
    //calculateRatFood(offerings,wheat):double
    public static int calcRatFood(int offerings, int wheat) {

        if (offerings < 0) {
            return -1;
        }
        if (wheat < 0) {
            return -1;
        }
        
        int ratAttack = randomInt(1,29);
        int ratFood = 0;
        
        if(ratAttack < 30){
            if (offerings < .08*wheat) {
                ratFood = wheat*randomInt(6,10)/100;
            }
            if (offerings >= .08*wheat && offerings <= .12*wheat) {
                ratFood = wheat*randomInt(3,7)/100;
            }
            if (offerings > .12*wheat) {
                ratFood = wheat*randomInt(3,5)/100;
            }            
        }
        
        return wheat-ratFood;
    }
    
    
    public static int randomInt(int lower, int upper) {
        return upper; // replace with random int between lower and upper, inclusive
    }
}

