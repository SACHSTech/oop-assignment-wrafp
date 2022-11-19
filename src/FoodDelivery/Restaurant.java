package FoodDelivery;
import FoodDelivery.*;

/**
 * Restaurant Class 
 * @author: K.huang
 */
public class Restaurant {
    
    // Instance Variables
    private String placeName;

    /**
     * Constructor - creates new instance of a restaurant object
     * @param thePlaceName - name of the restaurant
     */
    public Restaurant(String thePlaceName) {
        this.placeName = thePlaceName;
    }

    /**
     * @return the name of the restaurant
     */
    public String getPlaceName() {
        return placeName;
    }
}
