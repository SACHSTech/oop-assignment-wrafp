package FoodDelivery;
import FoodDelivery.*;

public class Drink extends Item {
    
    // Instance variables
    private String size;
    private boolean isHot;

    // Constructor
    public Drink(String theName, int thePrice, boolean theIsHot) {
        super(theName, thePrice);
        this.isHot = theIsHot;
    }

    // Methods
    public String getSize() {
        return size;
    }

    public boolean getIsHot() {
        return isHot;
    }

    public void setSize(String theSize) {
        this.size = theSize;
    }
}
