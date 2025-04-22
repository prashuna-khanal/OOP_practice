package Task2;

import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        System.out.println("No. of digits: "+digits);
    }
    
}
