package FoodDelivery;
import FoodDelivery.*;
import java.io.*;
import java.text.*;
import java.util.ArrayList;

/**
 * Insert description
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize 
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Item> menu = new ArrayList<>();
        ArrayList<Item> cart = new ArrayList<>();
        NumberFormat currencyFormat = new DecimalFormat("#,##0.00");

        // Variable initialization
        double total = 0;
        double discount = 0;
        double finalTotal;
        double tax;
        
        // Object initialization
        Restaurant place = new Restaurant("Outrageous Food Place");
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
        Drink water = new Drink ("Water", 2, false);
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

        System.out.println("\nWelcome to the Online Ordering App!");
        System.out.println("\nAccessing " + place.getPlaceName() + "!");
        System.out.println("----------------------------------------------------------------");
        Thread.sleep(2000);
        
        


        while (true) {
            for (int i = 0; i < menu.size(); i++) {
                System.out.println("(" + i + ")\n" + menu.get(i));
                Thread.sleep(150);
            }
            
            System.out.println("---------------------------");
            System.out.println("Select your order: (0-13)-Add to Cart (99)-Checkout (100)-Cancel\nEnter corresponding value: ");
            int option = Integer.parseInt(key.readLine());

            if (option >= 0 && option <= 13) {
                cart.add(menu.get(option));
                total += menu.get(option).getPrice();
            }
            else if (option == 100) {
                System.out.println("Exiting program...");
                System.exit(option);
            }
            else if (option == 99) {
                System.out.println("\nProceeding to Cart...\n");
                Thread.sleep(2000);
                break;
            }
            else { 
                System.out.println("Invalid value.");
            }
            
            Thread.sleep(500);
            System.out.println("Added " + menu.get(option).getName() + " to cart."); // Displays item added to cart
            System.out.println("---------------------------");
            Thread.sleep(800);
        }
        

        // Checkout Phase
        System.out.println("Items Purchased:");
        Thread.sleep(500);

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(" - " + cart.get(i).getName());
            Thread.sleep(150);
        }


        // Check for discount 
        if (total >= 50) {
            discount = total * .1;
        }
        else if (total >= 100) {
            discount = total * .2;
        }

        
        // Output the price of the order
        Thread.sleep(2000);
        System.out.println("\nReceipt: " +  place.getPlaceName() + "\n------------------------");
        System.out.println("Total: $" + currencyFormat.format(total));
        tax = (total - discount) * 0.13;
        finalTotal = tax + total;
        
        if (discount > 0) {
            System.out.println("Discount: -$" + currencyFormat.format(discount));
        }

        System.out.println("Tax: $" + currencyFormat.format(tax));
        System.out.println("Subtotal: $" + currencyFormat.format(finalTotal));
        System.out.println("\nThanks for ordering at " + place.getPlaceName() + " :)");
    }
}