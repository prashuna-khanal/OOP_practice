package Task5;

import java.util.Scanner;

public class Words_In_String {
    public static void words(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringToSplit = sc.nextLine();
        sc.close();                                          
        String[] word = stringToSplit.split("\\s+");        // returns array after split
        int count = word.length;                                  // length() for string .length for array
        System.out.println("No. of words: "+count);
    }
    public static void main(String[] args) {
        words();
    }
}
