//6. Generate random 10 integer numbers in an array and print out all the numbers from array
// and also print the max and min number from the array

import java.util.Random;

public class Problem6_Generate10RandomIntegerFindMaxMin {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int maxArray = 0;
        int minArray = 0;
        System.out.println("Here we are generating 10 random numbers in array between 1 to 100");
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(100);
            numbers[i] = j;
            if (i == 0) {
                maxArray = numbers[i];
                minArray = numbers[i];
            } else {
                if (numbers[i] > maxArray)
                    maxArray = numbers[i];
                if (numbers[i] < minArray)
                    minArray = numbers[i];
            }
        }
        System.out.println("Here is all the numbers of array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("The max number in the array: " + maxArray);
        System.out.println("The min number in the array: " + minArray);
    }
}
