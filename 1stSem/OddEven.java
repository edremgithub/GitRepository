import java.util.Scanner;

public class OddEven {
    public static void main (String[] args) {
        //"{}"class block tawag dito
        Scanner scan = new Scanner (System.in);

        System.out.print("enter a number");
        int Int = scan.nextInt();

        if ( Int == '1' || Int == '3' || Int == '5' || Int == '7' || Int == '9') {
            System.out.println(Int + "is ODD");
            
        } else {
        System.out.println(Int + "is EVEN");
        }
    }
}