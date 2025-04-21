package Task2;
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        // Mathematical Operations in numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();
        sc.close();
        
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1-num2;
        int quotient = num1/num2;

        System.out.println("Sum: "+sum+"\n"+"Product: "+product+"\n"+"Difference: "+difference+"\n"+"Quotient: "+quotient+"\n");
    }
}
