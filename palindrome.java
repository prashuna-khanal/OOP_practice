package Task2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str=sc.next();
        int length=str.length();
        String reversedString="";  
        for(int i=length-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        if (str.equals(reversedString)){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("Not a plindrome number");
        }
        sc.close();
    }
}
