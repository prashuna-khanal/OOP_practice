package Task5;

import java.util.Scanner;

public class Fibonacii_methods {
    public static void series(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms of Fibonacci series you want: ");
        int n = sc.nextInt();
        sc.close();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

        }
    }
    public static void main(String[] args) {
       series();
    }
}
