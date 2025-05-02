package Task5;

import java.util.Scanner;

public class Case_count {
    public static void stringcase(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string character: ");
    String str = sc.nextLine();
    sc.close();

    int upperCount = 0;
    int lowerCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)) {
                upperCount++;
            } else if (Character.isLowerCase(letter)) {
                lowerCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    }
    public static void main(String[] args) {
        stringcase();
    }
}
