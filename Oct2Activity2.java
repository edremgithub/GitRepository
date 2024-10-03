import java.util.Scanner;

public class Oct2Activity2 {
    public static void main (String[] args) {
       
        Scanner ope = new Scanner(System.in);
        System.out.println("Enter 5 grades: ");
        Double g1 = ope.nextDouble();
        Double g2 = ope.nextDouble();
        Double g3 = ope.nextDouble();
        Double g4 = ope.nextDouble();
        Double g5 = ope.nextDouble();
        Double ave = (g1+g2+g3+g4+g5)/5;

        if (ave >= 90) {

            if (ave >= 95) 
            {

                if (ave >= 98) 
                {
                    System.out.println("A+");
                } 
                
                else if (ave >= 96) 
                {
                    System.out.println("A");
                }

                else 
                {
                    System.out.println("A-");
                }
            }

        } 
        
        else if (ave >= 80) {

            if (ave >= 85) 
            {

                if (ave >= 88) 
                {
                    System.out.println("B+");
                } 
                
                else if (ave >= 86) 
                {
                    System.out.println("B");
                }

                else 
                {
                    System.out.println("B-");
                }
            }

        } 
    }
}