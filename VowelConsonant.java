public class VowelConsonant {
    public static void main (String[] args) {
        char ch = 'A';

        
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' 
        || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }
}