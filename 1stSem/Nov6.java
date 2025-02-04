public class Nov6 {
    public static void main (String[] args) {
        // int num = 236348 ;
        // int a = num;
        // int rem = 0;
        // int sum = 0;

        // while (num > 0) { 
        //     rem = num % 10;
        //     sum = sum + rem;
        //     num/=10;  
        // }

        // System.out.println("Given digit: " + a);
        // System.out.println("Sum of digits: " + sum);
        int row = 7;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            } System.out.println();
        } 
    }
}
