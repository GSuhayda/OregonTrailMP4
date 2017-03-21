/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonpackage;

/** a subclass of Location that has all the functionality of the Location class 
 *and also has a subclass Store. Inherits from location
 * @author Grant Pfeifer
 * @version 1.0 - 03 March 2017
 */
public abstract class City extends Location {
    // A value the is true if continuing is possible or not
    public boolean continueJourney = true;
    
    // A value the is true if shopping is possible or not
    public boolean isStoreAccessible = true;
    
    /**
     * Initializes a new object of the City class
     */
    public void City() {
        }
    
    /**
     * Allows the user to shop for supplies
     * @param curentUser the object that has the current users supplies
     */
    public void store(Supplies curentUser){
    
}
    
}
