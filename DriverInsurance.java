import java.util.Scanner;

public class DriverInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
 
        System.out.print("Enter Gender M/F: ");
        char gender = scanner.next().charAt(0);

        
        System.out.print("Enter Marital Status U/M: ");
        char maritalStatus = scanner.next().charAt(0);

      
        if (maritalStatus == 'M') {
            System.out.println("Driver should be Insured.");
        } else if (maritalStatus == 'U') {
            if ( gender == 'M' && age >= 30) {
                System.out.println("Driver should be Insured.");
            } else if (gender == 'F' && age >= 25) {
                System.out.println("Driver should be Insured.");
            } else {
                System.out.println("Driver should not be Insured.");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
