import java.util.Scanner;

public class OddEven 
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int xy = scanner.nextInt();

        if (xy == 1 || xy == 3 || xy == 5 || xy == 7 || xy == 9)

        {
            System.out.println(xy + " is an Odd Number");
        
        } 
        
        else {
            System.out.println(xy + " is an Even Number");
        }
            

        scanner.close();
    }
}