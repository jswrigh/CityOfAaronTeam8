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
    
    //allow user to plant crops
    public static int plantCrops(int acres) {
        System.out.println("Planting crops...");
        return 0;
    }
    
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
    
    //allow user to buy land
    public static int buyLand(int acres) {
        System.out.println("Buying land...");
        return 0;
    }

    //allow user to sell land
    public static int sellLand(int acres) {
        System.out.println("Selling land...");
        return 0;
    }

    //allow user to feed the people
    public static int feedPeople(int bushels) {
        System.out.println("Feeding people...");
        return 0;
    }

    //allow user to feed the people
    public static int payTithesAndOfferings(int offeringPercent) {
        System.out.println("Paying tithes and offerings...");
        return 0;
    }
    
    public static int randomInt(int lower, int upper) {
        return upper; // replace with random int between lower and upper, inclusive
    }
}

