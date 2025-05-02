package Task5;

import java.util.Scanner;

public class Sum_Range {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int sum=0;
        for(int i =1; i<=num; i++){
            sum+=i;
        }
        System.out.println("Sum of numbers till "+num+" is: "+sum);
    }
    public static void main(String[] args) {
        sum();
    }
}
