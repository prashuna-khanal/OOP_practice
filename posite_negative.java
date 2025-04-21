package Task2;
import java.util.Scanner;

public class posite_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Negative positive or Zero
        System.out.print("Enter a number to check if it is positive, negative or zero: ");
        int num=sc.nextInt();
        sc.close();
        if (num>0){
            System.out.println(num+"It's a positive number");
        }
        else if (num<0){
            System.out.println(num+"It's a negative number");
        }
        else{
            System.out.println("It's a zero.");
        }


        
    }
    
}
