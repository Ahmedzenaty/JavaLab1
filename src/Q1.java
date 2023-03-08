import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*FIRST QUESTION */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+ name);
        /*Seconed QUestion */
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("You will turn 100 years old in "+((100-age) + 2023));
        input.close();
    }
}