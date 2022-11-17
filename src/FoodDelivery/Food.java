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

    // Methods
    public boolean getIsSpicy() {
        return isSpicy;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public String toString() {
        return super.getName() + " | Price: $" + super.getPrice() + " |\nAttributes: Spicy: " + isSpicy + " | Vegan: " + isVegan + " | Gluten-Free: " + isGlutenFree + " |\n";  
    }
}
