import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {
        System.out.println("Putangina ka!");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter your yourName: ");
            String yourName = scan.nextLine();
            System.out.println("Hello " + yourName);
        }
    }
}