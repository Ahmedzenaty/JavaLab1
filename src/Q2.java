import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values to calculate the average for: ");
        int num = input.nextInt();
        float avrage;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter value "+ i + ": ");
            int number = input.nextInt();
            sum += number; 
        }
        avrage = sum / num;
        System.out.println("The average is: "+ avrage);
    }

}
