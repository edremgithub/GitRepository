import java.util.Scanner;

public class Oct3Activity 
{
    public static void main (String[] args) 
    {

        Scanner ope = new Scanner(System.in);
        System.out.println("Enter number to show date: ");
        int num = ope.nextInt();
        int year = num % 12;
        

        //Just like if else statement, pero mas straightforward siya
        switch(year)
        {
            case 0: System.out.println("Monkey");break;
            case 1: System.out.println("Rooster");break;
            case 2: System.out.println("Dog");break;
            case 3: System.out.println("Pig");break;
            case 4: System.out.println("Rat");break;
            case 5: System.out.println("Ox");break;
            case 6: System.out.println("Tiger");break;
            case 7: System.out.println("Tiger");break;
            case 8: System.out.println("Dragon");break;
            case 9: System.out.println("Snake");break;
            case 10: System.out.println("Horse");break;
            case 11: System.out.println("Sheep");break;

        }
    }
} //Take huge note sa class blocks, kasi kapag sobra/kulang yan hindi magrurun program niyo

