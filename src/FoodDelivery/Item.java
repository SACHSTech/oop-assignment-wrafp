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

    /**
     * Constructor - creates new instance of Item object
     * @param theName - the name of the item (food/drink)
     * @param thePrice - the price of the item (food/drink)
     */
    public Item(String theName, double thePrice) {
        this.name = theName;
        this.price = thePrice;
    }

    /**
     * @return the name of the food/drink
     */
    public String getName() {
        return name;
    }

    /**
     * @return the name of the food/drink
     */
    public double getPrice() {
        return price;
    }
}
