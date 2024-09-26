import java.util.Scanner;

public class VowelConsonantScanner {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' 
        || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }

        scanner.close();
    }
}