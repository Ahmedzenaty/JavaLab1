import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the positive number: ");
        int number = input.nextInt();
        if (number <= 0) {
        System.out.println("Input the positive number: ");
        number = input.nextInt();
        }
        if(number == 0 || number == 1){
            System.out.println("The number is not Prime");
        }
        int con = 0;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                con = 1;
                System.out.println("The number is not Prime");
                break;
            }
            else{
                con = 0;
                continue;
            }
        }
        if(con == 0){
            System.out.println("The number is Prime");
        }
    }
}
