import java.util.Scanner;
public class Johnpaul{
    public static void main(String[] args)
    {
        Scanner johnpaul = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Bossing = johnpaul.nextLine();
        System.out.println("hello, " +Bossing);

        System.out.println("how old are you");
        String age = johnpaul.nextLine();
        System.out.println("are you" + age + "years old");
    }
}