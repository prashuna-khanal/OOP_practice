package Task5;

import java.util.Scanner;

public class Reverse_int {

    Scanner sc = new Scanner(System.in);
       public static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num; // Use temp to count digits
        int digits = 0; 
        int reversed = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        for (int i = 0; i < digits; i++) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
    public static void main(String[] args) {
        reverse();
    }
    }

