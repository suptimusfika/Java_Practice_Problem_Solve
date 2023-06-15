//16. Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY
public class Problem16_EncryptWord {
    public static void main(String[] args) {
        String s = "ROADTOSDET";
        char arr[] = s.toCharArray();

        int k = 0;
        System.out.print("After Encryption, the word is : ");
        for (int i = 0; i < arr.length; i++) {
            int m = (int) arr[i];
            m = m + 5;
            arr[i] = (char) m;
            System.out.print(arr[i]);
        }
    }
}
