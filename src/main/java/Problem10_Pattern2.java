//10. Write a program that will give following output:
//12345
//2345
//345
//45
//5
public class Problem10_Pattern2 {
    public static void main(String[] args) {
        int m = 1;
        while (m <= 5) {
            for (int i = m; i <= 5; i++) {
                System.out.print(i);
            }
            System.out.println();
            m++;
        }
    }
}
