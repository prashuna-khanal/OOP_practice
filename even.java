package Task2;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if (num%2==0){
            System.out.print("Even"+num);
        }else{
            System.out.println("Odd"+num);
        }
    }
    
}
