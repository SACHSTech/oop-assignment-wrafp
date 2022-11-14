package FoodDelivery;
import FoodDelivery.*;

public class Food extends Item {
    
    // Instance variables
    private boolean isSpicy;
    private boolean isVegan;
    private boolean isGlutenFree;

    // Constructor
    public Food(String theName, double thePrice, boolean theIsSpicy, boolean theIsVegan, boolean theIsGlutenFree) {
        super(theName, thePrice); // temporarily static to test functionality, will fix later - super(getName(), getPrice());
        this.isSpicy = theIsSpicy;
        this.isVegan = theIsVegan;
        this.isGlutenFree = theIsGlutenFree;
    }

    public boolean getIsSpicy() {
        return isSpicy;
    }
}
