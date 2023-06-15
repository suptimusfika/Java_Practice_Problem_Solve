//12. Write a program that will shuffle (values will randomly change their position) from the given array
//numbers=[1,2,3,4,5,6,7,8,9,0]
//random output: 3 5 0 1 7 9 6 4 2 8
import java.util.Random;

public class Problem12_ShuffleArrayRandomly {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int j = r.nextInt(numbers.length);
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;

        }
        System.out.println("Randomly Shuffled Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
