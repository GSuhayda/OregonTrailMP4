/*
 * Gregory Fritts
 * 18 March 2017
 * Fort Class definition 
 */
package oregonpackage;

/**
 * Location along the trail that may contain a store
 * @author Gregory
 */
public class Fort extends Location{
    
    /**
     * Fort -Constructor creates a fort object of specific name.
     * @param name -The name of the fort to create, which is also the name 
     *          of the text file containing all of the information for the fort.
     */
    public Fort (String name) {
        
    }
    
    /**
     * continueJourney -Terminates the fort object and activates trail class.
     */
    public double continueJourney () {
        double distanceToNext = 0; 
        return distanceToNext; 
    }
    
    /**
     * openStore -Opens the store menu and modifies supplies class if items  are selected.
     */
    public void openStore () {
        
    }
}
