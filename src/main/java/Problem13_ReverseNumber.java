//13. Take any number as input and print the reverse of the number
//input: 12345
//output: 54321
import java.util.Scanner;

public class Problem13_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println("The reversed number is:" + reverse);
    }
}
