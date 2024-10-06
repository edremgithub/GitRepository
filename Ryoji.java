import java.util.Scanner;

public class Ryoji
{
    public static void main(String[] args)
    { 

        Scanner ope = new Scanner (System.in);
        System.out.println("bobo");
        int num = ope.nextInt();
        int month  = num - 1; 

        switch(month)
        {
            case 0: System.out.println("january");break; 
            case 1: System.out.println("february");break;
            case 2: System.out.println("march");break;
            case 3: System.out.println("april");break;
            case 4: System.out.println("may");break;
            case 5: System.out.println("june");break;
            case 6: System.out.println("july");break;
            case 7: System.out.println("aug");break;
            case 8: System.out.println("september");break;
            case 9: System.out.println("october");break;
            case 10: System.out.println("november");break;
            case 11: System.out.println("december");break;
        }

    }
}