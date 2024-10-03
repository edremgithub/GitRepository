import java.util.Scanner;

public class Oct3Activity2 {
    public static void main (String[] args) {
       
        Scanner ope = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = ope.nextInt();
        int num2 = ope.nextInt();
        int sum = num1 + num2;
        if (sum > 30) {
            System.out.println("The sum of 2 numbers is: " + sum + "\nThe number is greater than 30");
        } else {
            System.out.println("The sum of 2 numbers is: " + sum + "\nThe number is less than 30");
        }
    }
}