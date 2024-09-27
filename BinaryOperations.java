import java.util.Scanner;

public class BinaryOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two binary numbers as strings
        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Perform operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        String quotient = num2 != 0 ? Integer.toBinaryString(num1 / num2) : "undefined"; // Handle division by zero

        // Convert results back to binary
        String binarySum = Integer.toBinaryString(sum);
        String binaryDifference = Integer.toBinaryString(difference);
        String binaryProduct = Integer.toBinaryString(product);

        // Output the results
        System.out.println("Sum of the two binary numbers: " + binarySum);
        System.out.println("Difference of the two binary numbers: " + binaryDifference);
        System.out.println("Product of the two binary numbers: " + binaryProduct);
        System.out.println("Quotient of the two binary numbers: " + quotient);
    }
}
