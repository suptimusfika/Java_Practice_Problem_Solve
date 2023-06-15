//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class Problem2_SwapValueWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("a=" + a + ", ");
        System.out.println("b=" + b);
    }
}
