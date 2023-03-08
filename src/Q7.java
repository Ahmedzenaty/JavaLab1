import java.util.Scanner;;
public class Q7 {
    public static void main(String[] argc){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();
        System.out.println((number %2 == 0) ? "This is an even number." : "This is an odd number.");
    }
}
