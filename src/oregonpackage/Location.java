/*
 * Gregory Fritts
 * 18 March 2017
 * Location Super Class definition 
 */
package oregonpackage;

/**
 * Defines general outlines and functions for all locations in the game
 * @author Gregory
 */
public abstract class Location {
    
    /**
     * Location -Constructor that creates a location.
     */
    public Location () {
    
    }
    
    /**
     *  checkMap -Creates an object of the map class, displays it, and then closes map object.
     */
    public void checkMap () {
        
    }
    
    /**
     * checkSupplies -Displays the wagon's supplies on screen by accessing supplies object.
     */
    public void checkSupplies () {
    
    }
    
   /**
    * continueJourney -Transitions from current location to the trail, if on trail it continues journey.
    * @return distanceToNext -A double for the number of miles to the next location. Contained in text file.
    */ 
   public abstract double continueJourney ();
   
   /**
    * changePace -Provides gui for the game player to change pace.
    * @return -pace, an integer that specifies the correct number of miles per day the wagon should cover.
    */
   public int changePace () {
       int pace = 0; 
       return pace; 
   }
   
   /**
    * changeRations -Provides gui for the game player to change ration consumption.
    * @return -pace, an integer that specifies the correct number of lbs of food should be consumed per day.
    */
   public int changeRations () {
       int rations = 0; 
       return rations; 
   }
   
   /**
    * openStore -Provides abstract method for opening a store, must be defined per sub class. 
    */
   public abstract void openStore ();
}  


