package FoodDelivery;
import FoodDelivery.*;

/**
 * Item Class 
 * @author: K.huang
 */
public class Item {
    // Instance variables
    private String name;
    private double price;

    // Constructor
    public Item(String theName, double thePrice) {
        this.name = theName;
        this.price = thePrice;
    }

    // Methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
