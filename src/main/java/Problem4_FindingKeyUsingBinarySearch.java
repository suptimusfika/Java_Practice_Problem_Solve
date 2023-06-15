//4. Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
//key=5

import java.util.Arrays;
import java.util.Scanner;

public class Problem4_FindingKeyUsingBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = input.nextInt();
        int numbers[] = {1, 6, 9, 3, 5, 4, 7};
        int flag = binarySearch(numbers, key);
        if (flag == 1)
            System.out.println("Your key is found");
        else System.out.println("Your key is not found");
    }

    static int binarySearch(int[] array, int k) {
        Arrays.sort(array);
        int f = 0;
        int left = 0;
        int right = array.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] <= k) {
                left = middle + 1;
            } else right = middle;
        }
        if (left > 0 && array[left - 1] == k)
            return f = 1;
        else return f = 0;
    }
}
