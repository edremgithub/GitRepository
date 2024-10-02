import java.util.Scanner;

public class Oct2Activity2 {
    public static void main (String[] args) {
       
        Scanner ope = new Scanner(System.in);
        System.out.println("Enter 5 grades: ");
        int g1 = ope.nextInt();
        int g2 = ope.nextInt();
        int g3 = ope.nextInt();
        int g4 = ope.nextInt();
        int g5 = ope.nextInt();
        int ave = (g1+g2+g3+g4+g5)/5;

        if (ave >= 90) {
            System.out.println("Very good");
        } else if (ave >= 80) {
            System.out.println("Nice");
        } else if (ave >= 75) {
            System.out.println("Muntik na bumagsak");
        } else {
            System.out.println("YOU FAILED!!");
        } 
        
    }
}