//8. Print the prime numbers of 2 to 100
public class Problem8_PrintPrimeFrom2To100 {
    public static void main(String[] args) {
        int flag;
        System.out.println("Here is the prime numbers from 2 to 100: ");
        for (int i = 2; i <= 100; i++) {
            flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + "  ");
        }
    }
}
