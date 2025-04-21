package Task2;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
    // Vowel or consonant
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character to check if it is vowel or consonant: ");
    sc.close();
    char letter = sc.next().charAt(0);
    if(letter == 'a'|| letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u'|| letter == 'A'|| letter == 'E'|| letter == 'I'|| letter == 'O'|| letter == 'U')
    {
        System.out.println(letter+" is a vowel");
    }
    else{
        System.out.println(letter+" is a consonant");
    }
}
}
