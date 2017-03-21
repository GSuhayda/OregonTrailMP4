/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonpackage;

/**
 * A subclass of location that has options when a user arrives at the river
 * @author Grant Pfeifeer
 * @version 1.0 - 21 March 2017
 */
public abstract class River extends Location{
    // A value the is true if continuing is possible or not
    public boolean continueJourney = true;
    
    // A value the is true if shopping is possible or not
    public boolean isStoreAccessible = false;
    
    /**
     * Initializes a new object of the River class
     */
    public void River(){
    
}
    /**
     * attempt to void the river
     */
    public void ford(){
        
    }
    
    /**
     * attempt to caulk and float across
     */
    public void caulkAndFloat(){
        
    }
    
    /**
     * States whether the ferry is available to cross the river with
     * @param currentLocation the location of the current user
     * @return true if the ferry is available to cross the river, false if not
     */
    public boolean isFerryAvailable(Location currentLocation){
        return false;
    }
    
    /**
     * Allows the user to wait for better conditions to cross the river
     */
    public void waitAndSee(){
        
    }
    
    /**
     * Gets more info about the current location
     * @param currentLocation the current location of the user
     * @return a string containing more info about the location
     */
    public String moreInfo(Location currentLocation){
        return "void";
    }
    
}
