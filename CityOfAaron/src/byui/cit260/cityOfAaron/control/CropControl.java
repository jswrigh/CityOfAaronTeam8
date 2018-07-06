package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.CropControlException;

/**
 *
 * @author Jacob & Sterling
 */
public class CropControl {
    
    //allow user to plant crops
    public static void plantCrops(int acres) throws CropControlException {
        System.out.println("Planting crops...");
    }
    
    //calcHarvest(offerings,previousCropYield,acres):double
    public static int harvestCrops(int offerings, int previousCropYield, int acres) throws CropControlException {
        int yield = 0;
        if (offerings < 0) {
            throw new CropControlException("Offerings cannot be negative.");
        }
        if (previousCropYield < 0) {
            throw new CropControlException("Crop yield cannot be negative.");
        }
        if (acres < 0) {
            throw new CropControlException("Acres cannot be negative.");
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
    public static int calcRatFood(int offerings, int wheat) throws CropControlException {

        if (offerings < 0) {
            throw new CropControlException("Offerings cannot be negative.");
        }
        if (wheat < 0) {
            throw new CropControlException("Wheat cannot be negative.");
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
    public static void buyLand(int acres) throws CropControlException {
        
        if (acres < 0) {
            throw new CropControlException("Acres cannot be negative.");
        }
        
        System.out.println("Buying land...");
    }

    //allow user to sell land
    public static void sellLand(int acres) throws CropControlException {
        
        if (acres < 0) {
            throw new CropControlException("Acres cannot be negative.");
        }
        
        System.out.println("Selling land...");
    }

    //allow user to feed the people
    public static void feedPeople(int bushels) throws CropControlException {
        
        if (bushels < 0) {
            throw new CropControlException("Bushels cannot be negative.");
        }
        
        System.out.println("Feeding people...");
    }

    //allow user to feed the people
    public static void payTithesAndOfferings(int offerings) throws CropControlException {
        
        if (offerings < 0) {
            throw new CropControlException("Offerings cannot be negative.");
        }
        
        System.out.println("Paying tithes and offerings...");
    }
    
    public static int randomInt(int lower, int upper) {
        return upper; // replace with random int between lower and upper, inclusive
    }
}

