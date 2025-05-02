package Task5;

import java.util.Scanner;

public class Square_of_digits {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int number=num;
        sc.close();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;       // Get the last digit
            sum += digit * digit;       // Add square of digit
            num /= 10;                  // Remove the last digit
        }
        System.out.println("Sum of squares of digits of " + number + " is: " + sum);
    }

    public static void main(String[] args) {
       sum();
    }
}