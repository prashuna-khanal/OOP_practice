package Task2;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        String num = sc.nextLine();
        sc.close();
        int len= num.length();
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=(num.charAt(i));
        }
        System.out.println("Sum of digits of number - "+num+" is "+sum);


    }
    
}
