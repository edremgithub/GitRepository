import java.util.Scanner;

public class Nov14 {
    public static void main (String [] args) {
        Scanner ave = new Scanner(System.in);
        // int sum = 0;
        // for (int i=1; i <=10; i++) {
        //     System.out.print("Enter grade number "+ i + ": ");
        //     int num = ave.nextInt();
        //     sum += num;
        // } 

        // double average = (double)sum/10;
        // System.out.println("Average of grades is: " + average);
        // System.out.print("Enter Numnber: ");
        // int num = ave.nextInt();
       
        // for ( int i = 0; i <= 10; i++) {
        //     double prod = num * i;
        //    System.out.println(num + " x " + i + " = " + prod );

        // } System.out.println("Thank you!");
        System.out.print("Enter a Number: ");
        int num = ave.nextInt();

        if (num < 0) {
            System.out.println("Wrong Input!");
        } else {
            int prod =  1;
            for (int i = 1; i <= num; i++) {
                prod = prod * i; 
            } System.out.println("The Factorial of " + num + " is " + prod );
        }
    }
}