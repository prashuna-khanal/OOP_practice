package Task5;

import java.util.Scanner;

public class PalindromePrime {
    public static void numCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int temp= num;
        int digits=0;
        int reversed=0;
        int original = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        // Now reverse the number using num (which is still original)
        for (int i = 0; i < digits; i++) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            int j=0;
            for (int i=1;i<=original;i++){
                if (original==1){
                    System.out.println("Not prime");
                }
                else if (original%i==0){
                     j+=1 ;
                }
            }
            if (j==2){
                System.out.println("The num is both prime and Palindrome.");
            }
            else{ 
                System.out.println("The num is only Palindrome.");
            }
        } 
        else {
            System.out.println("Not a palindrome and prime number");
        }

    }
    public static void main(String[] args) {
        numCheck();
    }
}
