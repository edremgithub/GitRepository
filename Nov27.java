public class Nov27 {
    public static int sum (int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) 
        sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 1 to 10 is: " + sum(1,10));
        System.out.println("The sum of 20 to 30 is: " + sum(20,30));
        System.out.println("The sum of 35 to 45 is: " + sum(35,45));
        System.out.println("The product of 1 to 10 is: " + prod(20,30));
        System.out.println("The quotient of 1 to 10 is: " + quot(1,10));
        System.out.println("The quotient of 20 to 30 is: " + quot(20,30));
        System.out.println("The quotient of 35 to 45 is: " + quot(35,45));
        System.out.println("The highest number between 1 and 10 is: " + max(1,10));
        System.out.println("The lowest number between 20 and 30 is: " + min(20,30));
    }

    public static int quot (int i1, int i2) {
        int quot = 1;
        for (int i = i1; i <= i2; i++) 
        quot /= i;
        return quot;
    }

    public static int prod (int i1, int i2) {
        int prod = 1;
        for (int i = i1; i <= i2; i++) 
        prod *= i;
        return prod;
    }

    public static int max (int int1, int int2) {
        int result;
        if (int1 > int2) 
            result = int1;
        else 
            result = int2;
        return result;
    }

    public static int min (int int1, int int2) {
        int result;
        if (int1 > int2) 
            result = int2;
        else 
            result = int1;
        return result;
    }
}