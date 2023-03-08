import java.util.Scanner;
import javax.swing.JOptionPane;
public class Q5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        JOptionPane.showMessageDialog(null, "The Factorial Is : " + sum, "result", 1);
    }
}
