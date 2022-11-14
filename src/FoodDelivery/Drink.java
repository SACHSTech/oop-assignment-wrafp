package FoodDelivery;
import FoodDelivery.*;

public class Drink extends Item {
    
    // Instance variables
    private int size;
    private boolean isHot;

    // Constructor
    public Drink(String theName, int thePrice, int theSize, boolean theIsHot) {
        super(theName, thePrice);
        this.size = theSize;
        this.isHot = theIsHot;
    }

    // Methods
}
