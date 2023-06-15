//7. Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]
import java.util.Scanner;

public class Problem7_CountNotesForGivenAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        int rem=0;
        int notes[]={1000,500,200,100,50,20,10,5,2,1};
        for(int i=0;i<notes.length;i++){
            rem=amount/notes[i];
            if(rem!=0)
            {
                amount=amount-(rem*notes[i]);
                System.out.println(notes[i] + " " + rem);
            }
            if(amount==0)
                break;
        }
    }
}
