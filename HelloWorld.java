import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) 
    {
        // i love you Sir Ojay!!!!!
        try (Scanner scan = new Scanner(System.in))
        {
            System.out.print("Please enter your name ");
            String name = scan.nextLine();
            System.out.print("Hello " + name + " Welcome to Java!");
        }
    }
}