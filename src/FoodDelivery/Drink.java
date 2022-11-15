package FoodDelivery;
import FoodDelivery.*;

public class Drink extends Item {
    
    // Instance variables
    private String size;
    private boolean isHot;

    // Constructor
    public Drink(String theName, int thePrice, String theSize, boolean theIsHot) {
        super(theName, thePrice);
        this.size = theSize;
        this.isHot = theIsHot;
    }

    // Methods
    public String getSize() {
        return size;
    }

    public boolean getIsHot() {
        return isHot;
    }
}
