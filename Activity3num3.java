import java.util.Scanner;

public class Activity3num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine(); 
        int result = countVowel(word);
        
        
        System.out.println("The number of vowels in \"" + word + "\" is " + result);
        
        sc.close();
    }
    
    
    static int countVowel(String str) {
        str = str.toLowerCase(); 
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
