package sampleperson.src;
import java.util.Scanner;

public class SamplePerson {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       
       System.out.print("Enter first name: ");
       String fname = sc.nextLine();
       
       System.out.print("Enter last name: ");
       String lname = sc.nextLine();
       
       System.out.print("Enter birthday: ");
       String bday = sc.nextLine();
       
       System.out.print("Enter gender: ");
       String gender = sc.nextLine();
       
       System.out.print("Enter age: ");
       int age = sc.nextInt();
       
       
       Person p1 = new Person(fname, lname, bday, age, gender);
       
       
       p1.pInfo();
       
    }
    
}