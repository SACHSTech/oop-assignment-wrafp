package FoodDelivery;
import FoodDelivery.*;
import java.io.*;

/**
 * Insert description
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Online Ordering App!\nWhich restaurant will you be ordering from? (Enter number) ");
        System.out.println("1 - Premium Food Place, 2 - I Love Food\n");
        int choice = Integer.parseInt(key.readLine());

        if (choice == 1) {
            Restaurant r1 = new Restaurant("Premium Food Place");
        }
        else if (choice == 2) {
            Restaurant r2 = new Restaurant("I Love Food");
        }
        


    }
}