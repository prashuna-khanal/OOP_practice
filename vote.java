package Task2;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        if(age<18){
            System.out.println("Underage! Can't vote!!");
        }
        else{
            System.out.println("You can vote!!!!!");
        }

    }
    
}
