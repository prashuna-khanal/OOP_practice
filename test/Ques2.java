package test;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int digits =0;
        int sum = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        for (int i = 0; i < digits; i++) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;            
        }
        System.out.println("Sum of digits: "+sum);

    }
    
}
