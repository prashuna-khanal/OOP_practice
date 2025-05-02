package Task5;

import java.util.Scanner;

public class Reversed_Without_Temp {
    public static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("(Original) a: "+a+" b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("(Reversed) a: "+a+" b: "+b);
    }
    public static void main(String[] args) {
        reverse();
    }
}
