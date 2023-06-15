//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52

import java.util.Scanner;

public class Problem3_PrintValueUpTo2Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        double a = input.nextDouble();
        a = a * 100;
        int m = (int) a;
        double n = (double) m / 100;
        System.out.println("Value of given number up to 2 decimal point: " + n);
    }
}
