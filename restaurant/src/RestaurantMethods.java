package restaurant.src;

import java.util.Scanner;

public class RestaurantMethods {
    
    // Display menu items
    public static void displayMenu(Menu menu) {
        System.out.println("Menu:");
        for (int i = 0; i < menu.items.length; i++) {
            System.out.println((i + 1) + ". " + menu.items[i] + " - $" + menu.prices[i]);
        }
    }

    // Get price of an item
    public static int getPrice(Menu menu, int itemIndex) {
        return menu.prices[itemIndex];
    }

    // Customer places an order
    public static void placeOrder(Menu menu, Order order, Scanner scanner) {
        displayMenu(menu);
        System.out.print("Enter item number to order: ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= menu.items.length) {
            order.orderItems.add(menu.items[choice - 1]);
            order.total += getPrice(menu, choice - 1);
            System.out.println(menu.items[choice - 1] + " added to your order.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Prepare and serve order
    public static void prepareAndServeOrder() {
        System.out.println("Preparing your food...");
        System.out.println("Order is ready! Enjoy your meal.");
    }

    public static void processPayment(Order order, Scanner scanner) {
        System.out.println("Your total is: $" + order.total);
        System.out.print("Enter amount to pay: ");
        int paid = scanner.nextInt();

        if (paid >= order.total) {
            int change = paid - order.total;
            System.out.println("Payment successful! Thank you.");
            if (change > 0) {
                System.out.println("Your change is: $" + change);
            }
        } else {
            System.out.println("Insufficient payment. Please try again.");
            processPayment(order, scanner);
        }
    }
}
