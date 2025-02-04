import java.util.Scanner;

public class Feb4Act {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + circle(radius));
        
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of Square: " + square(side));
        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + rectangle(length, width));
        
        System.out.println("Thank you for using Area Calculator!");
    }
    
    public static double circle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double square(double side) {
        return side * side;
    }
    
    public static double rectangle(double length, double width) {
        return length * width;
    }
}
