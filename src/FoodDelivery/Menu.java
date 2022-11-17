package FoodDelivery;
import FoodDelivery.*;
import java.util.ArrayList;

public class Menu {

    // Arraylist for holding objects of Item objects
    ArrayList<Item> cart = new ArrayList<>();
    ArrayList<Item> menu = new ArrayList<>();

    // Instance Variables
    private int numItems;

    // Constructor
    public Menu(int theNumItems) {
        this.numItems = theNumItems;
    }

    // Methods
    public int getNumItems() {
        return this.numItems;
    }

}
