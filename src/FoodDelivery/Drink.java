package FoodDelivery;
import FoodDelivery.*;

/**
 * Drink Class 
 * @author: K.huang
 */
public class Drink extends Item {
    
    // Instance variables
    private boolean isHot;

    // Constructor
    public Drink(String theName, int thePrice, boolean theIsHot) {
        super(theName, thePrice);
        this.isHot = theIsHot;
    }

    // Methods
    public boolean getIsHot() {
        return isHot;
    }

    public String toString() {
        return super.getName() + " | Price: $" + super.getPrice() + "\n Hot: " + isHot + "\n";  
    }
}
