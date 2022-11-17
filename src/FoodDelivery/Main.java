package FoodDelivery;
import FoodDelivery.*;
import java.io.*;

/**
 * Insert description
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Online Ordering App!\nWhich restaurant will you be ordering from?");
        System.out.println("1 - Premium Food Place\n2 - Outrageous Eating Shack\nEnter number: ");
        
        // Choosing which menu/restaurant to view
        while (true) {
            int choice = Integer.parseInt(key.readLine());
 
            if (choice == 1) {
                Restaurant r1 = new Restaurant("Premium Food Place");
 
                // Create menu
                Food pizza = new Food("Pizza", 16, false, false, false);
                Food salad = new Food("Salad", 12, false, true, false);
                Food chickensoup = new Food("Chicken Soup", 10, false, false, true);
                Food tomatosoup = new Food("Tomato Soup", 10, false, true, true);
                Drink hotcoffee = new Drink ("Hot Coffee", 4, true);
                Drink icedcoffee = new Drink ("Iced Coffee", 5, false);
                Drink pepsi = new Drink ("Pepsi", 3, false);
 
                break;
            }
            else if (choice == 2) {
                Restaurant r2 = new Restaurant("Outrageous Eating Shack");
 
                Food burger = new Food("Burger", 14, true, false, false);
                Food veganburger = new Food("Vegan Burger", 16, false, true, false);
                Food popcornchicken = new Food("Popcorn Chicken", 13, false, false, false);
                Food fries = new Food("Fries", 7, false, true, false);
                Drink cola = new Drink ("Coca Cola", 3, false);
                Drink water = new Drink ("Water", 15, false);
                Drink greentea = new Drink ("Green Tea", 5, true);
 
                break;
            }

                
 
                break;
            }
            else {
                System.out.println("Invalid restaurant option.");
            }

            while (true) {
                pizza.getName(); //perhaps avoid using static methods as any user of the class will not be able to change values unless they know/have access to the code
            }

        
       
        


    }
}