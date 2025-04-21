package Task2;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");        
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        sc.close();
        if (a>b){
            if (a>c){
                System.out.println(a+"is the highest number");
            }
        }
        else{
            if (b>c){
                System.out.println(b+"is the highest number");
            }
            else{
                System.out.println(c+"is the highest number");
            }
        }
    }
    
}
