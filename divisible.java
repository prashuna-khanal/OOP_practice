package Task2;
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is divisible by 5 and 11: ");
        int num1=sc.nextInt();
        sc.close();
        if (num1%5 == 0 && num1%11==0){
            System.out.println(num1+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num1+" is not divisible by 5 and 11");
        }
    }
    
}
