package Task5;

import java.util.Scanner;

public class Cube {
    public static void cubeOfNumber(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int cube = num*num*num;
        System.out.println("Cube of "+num+" is "+cube);
    }
    public static void main(String[] args) {
        cubeOfNumber();
    }
}
