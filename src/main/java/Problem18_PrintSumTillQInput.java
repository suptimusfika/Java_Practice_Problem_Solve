//18. Write a program that will take integer numbers as user input continuously and
// print the sum of numbers until user input q from the keyboard.
// When user input q, program will be quit. If user inputs another character,
// then the program will ask to input the number again.
import java.util.Scanner;

public class Problem18_PrintSumTillQInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        int number = 0;
        System.out.println("Enter the number:");
        do {
            number += input.nextInt();
            System.out.println("The sum is " + number);
            System.out.println("If you want to quit, please enter q");
            ch = input.next().charAt(0);
            if (ch == 'q')
                break;
            else
                System.out.println("Input the number again");
        } while (ch != 'q');
    }
}
