
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) 
    {
        System.out.println("What is your name");

        Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.println("Ikaw pala si " + name + ", Kupal ka ba?");
            System.out.println("Ilang taon ka nang kupal?");
            String age = scan.nextLine();
            System.out.println( age + ", tanda mo na gago");

        


       
    }
}
