import java.util.Scanner;

public class OddEven 
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int xy = scanner.nextInt();

        //Dito papasok ang mga numbers kapag ang dulo nila ay 1,3,5,7, and 9
        if (xy == 1 || xy == 3 || xy == 5 || xy == 7 || xy == 9)

        {
            System.out.println(xy + " is an Odd Number");
        
        } 
        
        //If even naman ang number, dito siya papasok.
        else {
            System.out.println(xy + " is an Even Number");
        }
    }
}