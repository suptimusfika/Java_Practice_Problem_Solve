//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
import java.util.Scanner;

public class Problem17_PalindromeStringCheck {
    public static void main(String[] args) {
        int flag = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = input.next();
        char arr[] = s.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[j] || ((int) (arr[i]) + 32) == (int) arr[j] || (int) (arr[i]) == ((int) (arr[j]) + 32)) {
                flag = 1;
                j--;
            } else {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("True");
        } else System.out.println("False");

    }
}
