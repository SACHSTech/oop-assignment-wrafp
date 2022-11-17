package FoodDelivery;
import FoodDelivery.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Insert description
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Item> menu = new ArrayList<>();

        System.out.println("Welcome to the Online Ordering App!");
        System.out.println("Accessing Outrageous Food Place");
        
        // Create menu objects
        Food pizza = new Food("Pizza", 16, false, false, false);
        Food salad = new Food("Salad", 12, false, true, false);
        Food chickensoup = new Food("Chicken Soup", 10, false, false, true);
        Food tomatosoup = new Food("Tomato Soup", 10, false, true, true);
        Food burger = new Food("Burger", 14, true, false, false);
        Food veganburger = new Food("Vegan Burger", 16, false, true, false);
        Food popcornchicken = new Food("Popcorn Chicken", 13, false, false, false);
        Food fries = new Food("Fries", 7, false, true, false);
        Drink hotcoffee = new Drink ("Hot Coffee", 4, true);
        Drink icedcoffee = new Drink ("Iced Coffee", 5, false);
        Drink pepsi = new Drink ("Pepsi", 3, false);
        Drink cola = new Drink ("Coca Cola", 3, false);
        Drink water = new Drink ("Water", 15, false);
        Drink greentea = new Drink ("Green Tea", 5, true);

        menu.add(pizza);
        menu.add(salad);
        menu.add(chickensoup);
        menu.add(tomatosoup);
        menu.add(burger);
        menu.add(veganburger);
        menu.add(popcornchicken);
        menu.add(fries);
        menu.add(hotcoffee);
        menu.add(icedcoffee);
        menu.add(pepsi);
        menu.add(cola);
        menu.add(water);
        menu.add(greentea);

        while (true) {
            for (int i = 0; i < menu.size(); i++) {
                menu.get(i);
            }
            
            System.out.println("\nSelect menu option");


        }
        
        
       
        


    }
}