import java.util.Scanner;

public class Main1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two sides of a rectangle: ");
        int width = scan.nextInt();
        int height = scan.nextInt();
        int area = width * height;

        System.out.println("The area of the rectangle is: " + area);
        
    }
}