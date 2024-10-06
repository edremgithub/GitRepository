import java.util.Scanner;
public class Triangle {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle: ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        int sum = side1 + side2 + side3;

        if (sum == 180) {
            System.out.println("EQUILATERAL");
        } else if (sum > 180) {
            System.out.println("SCALENE");
        } else {
            System.out.println("ISOSCELES");
        }
    }
}