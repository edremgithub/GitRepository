import java.util.Scanner;

public class Madamsystem {
    public static void main(String[] args) {
        Scanner bhie = new Scanner (System.in);
        System.out.println("Enter the 3 taligiran of a triangle :3 : ");
        int taligiran1 = bhie.nextInt();
        int taligiran2 = bhie.nextInt();
        int taligiran3 = bhie.nextInt();
        int sum = taligiran1 + taligiran2 + taligiran3;

        if (sum == 180) {
            System.out.println("EQUILATERAL");
        } else if (sum > 180) {
            System.out.println("SCALENE");
        } else {
            System.out.println("ISOCELES");
        }      
    }
}

