package Task5;

import java.util.Scanner;

public class SimpleInterestMethod {
    public static void interest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the time period: ");
        int t = sc.nextInt();
        System.out.print("Enter the rate for interest: ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("Simple Interest: "+ (p*t*r)/100);
    }
    public static void main(String[] args) {
        interest();
    }    
}
