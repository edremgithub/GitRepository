import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextInt();

        // Perform operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2 ; // Handling division by zero
        double modulus = num1 % num2 ;

        // Display results
        System.out.println("Results:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
        System.out.println("Modulus% : "+ modulus);
    }
}
