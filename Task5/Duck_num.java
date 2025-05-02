package Task5;

import java.util.Scanner;

public class Duck_num {
    public static void check(){
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    if (num == 0) {
        System.out.println("0 is not a Duck number.");
        return;
    }

    int temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit == 0) {
           System.out.println(num+"  is a Duck number");
            break;
        }
        temp /= 10;
     } 
    }
    public static void main(String[] args) {
        check();
    }
}
