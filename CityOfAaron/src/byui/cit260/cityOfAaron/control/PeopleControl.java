package byui.cit260.cityOfAaron.control;

/**
 *
 * @author sterling
 */
public class PeopleControl {
    
    public static int shrinkPopulation (int foodBushels, int BUSHELS_PER_PERSON, int currentPopulation) {
        int peopleFed = foodBushels/BUSHELS_PER_PERSON;           
        int peopleStarved = currentPopulation - peopleFed;
        if(peopleStarved > 0){ 
            return currentPopulation-peopleStarved;
        }else {
            return 0;
        }
    }
}