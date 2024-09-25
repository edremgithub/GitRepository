// Use this line to import Scanner and use the Scanner element so you can type in the terminal
import java.util.Scanner;

// public class (Name of your class) is a standard to start a project. THIS IS A MUST!!
public class MainClass
{
    public static void main(String[] args) 
    {
        // This first line of code will print out the words within the parentheses when you run your code or press F5
        System.out.println("Welcome to Java!");

        // This code will execute the said element so you can type it in terminal
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.print("Please enter your name: ");
            String name = scan.nextLine();
            System.out.println("Hello " + name + " Welcome to Java!");
        }
    }
}

// NOTICE THE OPEN AND CLOSE CLASS BLOCKS, BE MINDFUL ABOUT ABOUT THE PLACEMENTS OF THESE CLASS BLOCKS