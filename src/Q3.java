import java.net.Socket;
import java.util.Random;
import java.util.Scanner;;
public class Q3 {
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number); /* Remove this line after finishing */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        while(num != number){
            if(num + 5 > number && num - 5 < number){
                System.out.println("Too High!");
                System.out.println("Enter the number again: ");
                num = input.nextInt();
            }
            else{
                System.out.println("Too Low");
                System.out.println("Enter the number: ");
                num = input.nextInt();
            } 
    }
    System.out.println("Correct!");
    }
}
