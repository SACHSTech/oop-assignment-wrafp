package FoodDelivery;
import FoodDelivery.*;

/**
 * Drink Class 
 * @author: K.huang
 */
public class Drink extends Item {
    
    // Instance variables
    private boolean isHot;

    /**
     * Constructor - creates new instance of drink object
     * @param theName - the name of the drink
     * @param thePrice - the price of the drink
     * @param theIsHot - if the drink is hot/cold
     */
    public Drink(String theName, int thePrice, boolean theIsHot) {
        super(theName, thePrice);
        this.isHot = theIsHot;
    }

    /**
     * @return if the drink is hot/cold
     */
    public boolean getIsHot() {
        return isHot;
    }

    /**
     * @return drink with all its properties (name, price, hot/cold)
     */
    public String toString() {
        return super.getName() + " | Price: $" + super.getPrice() + "\n Hot: " + isHot + "\n";  
    }
}
