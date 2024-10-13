import java.util.Scanner;
public class Interest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, marital;
        int age;
        double interest, borrowed, service, docStamps, interestRate, salary;

        System.out.println("Enter your NAME: ");
        name = scan.nextLine();
        System.out.println("Enter your AGE: ");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your MARITAL STATUS: ");
        marital = scan.nextLine();

        System.out.println("Enter your SALARY: ");
        salary = scan.nextDouble();
        System.out.println("Enter BORROWED AMOUNT: ");
        borrowed = scan.nextDouble();

        if (salary < 25000 && salary > 0) {
            interestRate = 2.5;
        } else if (salary >= 25000 && salary < 35000) {
            interestRate = 5;
        } else if (salary >= 35000 && salary < 50000) {
            interestRate = 5.8;
        } else if (salary >= 50000 && salary < 80000) {
            interestRate = 7;
        } else if (salary >= 80000 && salary < 100000) {
            interestRate = 8.5;
        } else {
            interestRate = 10;
        }

        interest = (borrowed*interestRate)/100;
        service = (borrowed*1)/100;
        docStamps = (borrowed*2)/100;

        double totalInterest = interest + service +docStamps;

        System.out.println("Your NAME is: " + name);
        System.out.println("Your AGE is: " + age);
        System.out.println("Your MARITAL STATUS: " + marital);
        System.out.println("Your SALARY is: " + salary);

        System.out.println("About your borrowed money and interest...");
        System.out.println("Your BORROWED AMOUNT: " + borrowed);
        System.out.println("Your INTEREST RATE: " + interestRate + "%");
        System.out.println("SERVICE CHARGE (1%): " + service);
        System.out.println("DOCUMENT STAMPS (2%): " + docStamps);
        System.out.println("Your SIMPLE INTEREST: " + interest);
        System.out.println("Your TOTAL INTEREST: " + totalInterest);

    }
}