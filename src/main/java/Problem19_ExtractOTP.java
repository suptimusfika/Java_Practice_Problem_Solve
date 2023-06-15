//19. Extract the OTP from the SMS. "Your one time password is 246148.
// Don't share this code with anyone \r\nBvwt3f8js2S"
public class Problem19_ExtractOTP {
    public static void main(String[] args) {
        String SMS = "Your one time password is 246148. Don't share this code with anyone \\r\\nBvwt3f8js2S\"";
        String arr[] = SMS.split(" ");
        String arr2[] = arr[5].split("\\.");
        String token = arr2[0];
        System.out.println("The token is: " + token);
    }
}
