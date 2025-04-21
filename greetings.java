package Task2;
import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        // Greetings according to name
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning "+name + "!");
    }
    
}
