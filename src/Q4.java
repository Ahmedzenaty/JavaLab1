import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The Number Is EVEN");
        }
        else{
            System.out.println("The Number Is ODD");
        }
    }
}
