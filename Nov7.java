public class Nov7 {
    public static void main (String [] args) {
        // int i, j, row = 6;

        // for(i=0; i< row ; i++) {
        //     for (j=row-i; j>1; j--) {
        //         System.out.print(" ");
        //     } for (j=0; j<=i; j++) {
        //         System.out.print("* ");
        //     } 
        //     System.out.println();
        // }
        int rows = 8;
        for (int i = 0; i <= rows - 1; i++) {    
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= rows -1 -i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 
    }
}