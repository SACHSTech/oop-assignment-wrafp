package FoodDelivery;
import FoodDelivery.*;

public class Item {
    
    // Instance variables
    private String name;
    private double price;
    private boolean isBought;

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

    public void setIsBought() {
        isBought = true;
    }
}
