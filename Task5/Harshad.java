package Task5;

import java.util.Scanner;

public class Harshad {
    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad num or not: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num%sum==0){
            System.out.println("Harshad Number: "+ num);
        }
        else{
            System.out.println("Not a Harshad Number: "+num);
        }
    }
    public static void main(String[] args) {
        check();
    }
}
