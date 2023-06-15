//5. Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5

import java.util.Scanner;

public class Problem5_FindingKeyUsingLinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = input.nextInt();
        int flag = 0;
        int numbers[] = {1, 6, 9, 3, 5, 4, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                flag = 1;
                System.out.println("Your key is found in " + i + " position");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Your key is not found");
        }
    }
}
