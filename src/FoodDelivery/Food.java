package FoodDelivery;
import FoodDelivery.*;

public class Food extends Item {
    
    // Instance variables
    private boolean isSpicy;
    private boolean isVegan;
    private boolean isGlutenFree;

    // Constructor
    public Food(boolean theIsSpicy, boolean theIsVegan, boolean theIsGlutenFree) {
        super(getName(), getPrice()); // temporarily static to test functionality, will fix later
        this.isSpicy = theIsSpicy;
        this.isVegan = theIsVegan;
        this.isGlutenFree = theIsGlutenFree;
    }
}
