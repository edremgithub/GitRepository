import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name of Employee: ");
        String name = scan.nextLine();
        System.out.println("Enter ID Number of Employee: ");
        String studno = scan.nextLine();
        System.out.println("Enter Age of Employee: ");
        int age = scan.nextInt();
        System.out.println("Enter Hours of Work: ");
        int hrs = scan.nextInt();
        System.out.println("[C] Contractual");
        System.out.println("[R] Regular");
        char job = scan.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Emp ID: " + studno);
        System.out.println("Age: " + age);
        System.out.println("Hrs Worked: " + hrs);
        System.out.println("Type of Employment: " + job);

        

        if (job == 'c' || job == 'C') {
            int SSS = 200;
            int PhilHealth = 250;
            int gsalary = hrs * 50;
            int netsalary = gsalary - SSS - PhilHealth;

            System.out.println("Your Deductions are: ");
            scan.nextLine();
            System.out.println("SSS: " + SSS);
            scan.nextLine();
            System.out.println("Philhealth: " + PhilHealth);
            scan.nextLine();
            System.out.println("Your gross salary is: " + gsalary);
            scan.nextLine();
            System.out.println("Your net salary is: " + netsalary);

        } else if (job == 'r' || job == 'R') {
            int SSS = 300;
            int PhilHealth = 300;
            int Pagibig = 400;
            int gsalary = hrs * 250;
            double tax = gsalary * 0.05;
            double netsalary = gsalary - SSS - PhilHealth - Pagibig - tax;

            System.out.println("Your Deductions are: ");
            scan.nextLine();
            System.out.println("SSS: " + SSS);
            scan.nextLine();
            System.out.println("Philhealth: " + PhilHealth);
            scan.nextLine();
            System.out.println("Pag-ibig: " + Pagibig);
            scan.nextLine();
            System.out.println("Tax: " + tax);
            scan.nextLine();
            System.out.println("Your gross salary is: " + gsalary);
            scan.nextLine();
            System.out.println("Your net salary is: " + netsalary);
        }
    }
}