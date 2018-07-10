package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.PeopleControlException;

/**
 *
 * @author sterling
 */
public class PeopleControl {
    
    public static int shrinkPopulation (int foodBushels, int BUSHELS_PER_PERSON, int currentPopulation) throws PeopleControlException {
        
        if(foodBushels < 0){
            throw new PeopleControlException("Food bushels cannot be lower than 0.");
        }
        
        if(BUSHELS_PER_PERSON < 0){
            throw new PeopleControlException("Bushels per person cannot be lower than 0.");
        }
        
        if(currentPopulation < 0){
            throw new PeopleControlException("Population cannot be lower than 0.");
        }
        
        int peopleFed = foodBushels/BUSHELS_PER_PERSON;           
        int peopleStarved = currentPopulation - peopleFed;
        if(peopleStarved > 0){ 
            return currentPopulation-peopleStarved;
        }else {
            return 0;
        }
    }
}