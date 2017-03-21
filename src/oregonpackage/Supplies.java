/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonpackage;

/**
 * a subclass of location that supplies can be created in order to be bought and
 * used
 * @author Grant Pfeifer
 * @version 1.0 - 21 March 2017
 */
public class Supplies {
    // initializes new supplies object
    public void Supplies(){
        
    }
    
    /**
     * Get the amount of supplies you have
     * @return the amount of supplies you have
     */
    public int getAmount(){
        return 0;
    }
    
    /**
     * add or subtract the amount of supplies you have
     * @param amount the amount of supplies used(negative number) or bought(positive)
     */
    private void changeAmount(int amount){
        
    }
    
    /**
     * Use one of the supplies
     * @param amount an integer of the amount of supplies to be used
     */
    public void useSupplies(int amount){
        this.changeAmount(-amount);
    }
    
    /**
     * Allows the user to buy supplies
     * @param amount an integer of the amount of supplies to be bought
     */
    public void buySupplies(int amount){
        this.changeAmount(amount);
    }
    
    /**
     * Gets the price of an item
     * @param currentLocation the current location of the user
     * @param supply the object the user wants to but
     * @return the price as a double
     */
    public static double getPrice(Location currentLocation, Supplies supply){
        return 10.00;
    }
}
