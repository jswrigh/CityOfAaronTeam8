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
    
    public static int randomInt(int lower, int upper) {
        return upper; // replace with random int between lower and upper, inclusive
    }
}

