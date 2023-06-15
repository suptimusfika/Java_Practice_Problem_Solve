//11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;

public class Problem11_Find2ndLargestFromArray {
    public static void main(String[] args) {
        int numbers[] = {5, 3, 9, 7, 4, 1, 8};
        Arrays.sort(numbers);
        System.out.println("The 2nd largest element = " + numbers[numbers.length - 2]);
    }
}
