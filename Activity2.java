import java.util.Scanner;
public class Activity2 {
public static void main(String args[]) {
    Scanner ojay = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n= ojay.nextInt();
    int i, j,number;
    for(i=0; i<n; i++) {
        number=1;
        for(j=0; j<=i; j++) {
        System.out.print(number+" ");
        number++;
        }
        System.out.println();
        }
    }
}