import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch (x) {
            case (2):
            case (3):
            System.out.println("Two or Three");
                break;
            case (4):
            System.out.println("Four");
            break;
            default:
            System.out.println("other value");
                break;
        }
    }
}
