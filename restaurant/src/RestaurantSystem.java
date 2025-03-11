package restaurant.src;
import java.util.Scanner;

public class RestaurantSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        RestaurantMethods.placeOrder(menu, order, scanner);
        RestaurantMethods.prepareAndServeOrder();
        RestaurantMethods.processPayment(order, scanner);
    }
}