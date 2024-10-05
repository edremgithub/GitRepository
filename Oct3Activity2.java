import java.util.Scanner;

public class Oct3Activity2 {
    public static void main (String[] args) {
       
        Scanner ope = new Scanner(System.in);
        System.out.println("Enter 5 grades: ");
        //Naka double para pwede isasama ng system mo yung decimal kapag naglagay ka sa scanner.
        Double g1 = ope.nextDouble();
        Double g2 = ope.nextDouble();
        Double g3 = ope.nextDouble();
        Double g4 = ope.nextDouble();
        Double g5 = ope.nextDouble();
        Double ave = (g1+g2+g3+g4+g5)/5;
        
        // First if statement, para ang 'ave' ay papasok diyan kung equal or more than 90 ang nilagay niyo
        if (ave >= 90) 
        {
            // 2nd if statement, pasok pa rin siya sa first pero this time may mas kailangan ka na specific na parameter
            if (ave >= 95) 
            {
                //3rd if statement. Dito na papasok kapag nadaanan niya na ang 1st and 2nd if statements.
                if (ave >= 98) 
                {
                    System.out.println("A+");
                } 

                //Nakapasok siya sa 2 if statements mo pero need mo pa ng iba pang parameter. Hence, else if.
                else if (ave >= 96) 
                {
                    System.out.println("A");
                }

                //Kapag nakapasok sa 2 if statements pero wala siya sa 3rd if and sa else if. Dito na papasok ang else.
                else 
                {
                    System.out.println("A-");
                }
            }

        } 
        
        //Same lang siya sa example sa taas, pero pansin niyo else if ginamit instead of if kasi may unang if ka na.
        else if (ave >= 80) 
        {

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