package Task5;

import java.util.Scanner;

public class Ascii_For_Characters {
    public static void getAscii() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char chr = sc.next().charAt(0);
        sc.close();
        int ascii = (int) chr; // Type casting char to int gives ASCII value
        System.out.println("The ASCII value of '" + chr + "' is: " + ascii);
        
    }

    public static void main(String[] args) {
        getAscii();
    }    
}
