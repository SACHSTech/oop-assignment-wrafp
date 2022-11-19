package FoodDelivery;
import FoodDelivery.*;

/**
 * Food Class 
 * @author: K.huang
 */
public class Food extends Item {
    
    // Instance variables
    private boolean isSpicy;
    private boolean isVegan;
    private boolean isGlutenFree;

    /**
     * Constructor - creates new instance of food object
     * @param theName - the name of the food
     * @param thePrice - the price of the food
     * @param theIsSpicy - if the food is spicy
     * @param theIsVegan - if the food is vegan
     * @param theIsGlutenFree - if the food is gluten-free
     */
    public Food(String theName, double thePrice, boolean theIsSpicy, boolean theIsVegan, boolean theIsGlutenFree) {
        super(theName, thePrice); // temporarily static to test functionality, will fix later - super(getName(), getPrice());
        this.isSpicy = theIsSpicy;
        this.isVegan = theIsVegan;
        this.isGlutenFree = theIsGlutenFree;
    }

    /**
     * @return if the food is spicy
     */
    public boolean getIsSpicy() {
        return isSpicy;
    }

    /**
     * @return if the food is vegan
     */
    public boolean getIsVegan() {
        return isVegan;
    }

    /**
     * @return if the food is gluten-free
     */
    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    /**
     * @return food with all its properties (name, price, spiciness, vegan friendly, gluten-free)
     */
    public String toString() {
        return super.getName() + " | Price: $" + super.getPrice() + " |\nAttributes: Spicy: " + isSpicy + " | Vegan: " + isVegan + " | Gluten-Free: " + isGlutenFree + " |\n";  
    }
}
