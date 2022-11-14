package FoodDelivery;
import FoodDelivery.*;

public class Food extends Item {
    
    // Instance variables
    private boolean isSpicy;
    private boolean isVegan;
    private boolean isGlutenFree;

    // Constructor
    public Food(boolean theIsSpicy, boolean theIsVegan, boolean theIsGlutenFree) {
        super("apple", 15.00); // temporarily static to test functionality, will fix later - super(getName(), getPrice());
        this.isSpicy = theIsSpicy;
        this.isVegan = theIsVegan;
        this.isGlutenFree = theIsGlutenFree;
    }
}
