import java.util.Scanner; //nilalagay to para pwede tayo makapagtype tuwing i-rurun ang program

public class Arithmetic //ang 'Arithmetic' ay file name lang. Kayo bahala kung ano file name ilalagay niyo basta Capital first letter.
{ 
    public static void main(String[] args)
     { 
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
        double division = num1 / num2 ;
        double modulus = num1 % num2 ;

        // Display results
        System.out.println("Results:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus% : "+ modulus);
    }
}
