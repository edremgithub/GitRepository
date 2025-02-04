public class Nov28 {
    public static void main (String[] args) {
        //Exercise 1

        // int myList[] = new int[6];
        // myList[0] = 8;
        // myList[1] = 9;
        // myList[2] = 13;
        // myList[3] = 24;
        // myList[4] = 2;
        // myList[5] = myList[0] + myList[4];
        // System.out.println(myList[5]);

        //Exercise 2

        // int[] values = new int[5];
        // for (int i=1; i<5; i++) {
        //     values[i] = i + values[i-1];
        // } 
        // values[0] = values[1] + values[4];
        // System.out.println(values[4]);

        // Exercise 3
        int[] myList = new int[5];
        java.util.Scanner input = java.util.scanner(System.in);
        System.out.println("Enter " + myList.length + "values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        } 
        
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

    }
}