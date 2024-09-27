import java.util.Scanner;

public class BinaryAddition {

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

        // Add the two numbers
        int sum = num1 + num2;

        // Convert the result back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Output the result
        System.out.println("Sum of the two binary numbers: " + binarySum);
    }
}
