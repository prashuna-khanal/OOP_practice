package Task5;

import java.util.Scanner;

public class Kaprekar {

    public static void checkKaprekar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if it is a Kaprekar num: ");
    int num = sc.nextInt();
    sc.close();
    if (num < 1) {
        System.out.println(num + " is NOT a Kaprekar number.");
        return;
    }
    long square = (long) num * num;
    String squareStr = Long.toString(square);

    int len = squareStr.length();
    String left = squareStr.substring(0, len / 2);
    String right = squareStr.substring(len / 2);

    int leftNum = (left.isEmpty()) ? 0 : Integer.parseInt(left);
    int rightNum = Integer.parseInt(right);

    if (leftNum + rightNum == num) {
        System.out.println(num + " is a Kaprekar number.");
    } else {
        System.out.println(num + " is NOT a Kaprekar number.");
    }
    }
    public static void main(String[] args) {
        checkKaprekar();  // Example
    }
}
