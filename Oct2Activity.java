import java.util.Scanner;

public class Oct2Activity 
{
    public static void main (String[] args) //Constant na to, wala kayong babaguhin dito
    {
       
        Scanner ope = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");

        int num1 = ope.nextInt();
        int num2 = ope.nextInt();
        int sum = num1 + num2;

        //Situtational ang mga conditions dito, depende sa hinahanap na output
        if (sum > 30) 
        {
            System.out.println("The sum of 2 numbers is: " + sum + "\nThe number is greater than 30");
        } else 
        {
            System.out.println("The sum of 2 numbers is: " + sum + "\nThe number is less than 30");
        }
    }
}