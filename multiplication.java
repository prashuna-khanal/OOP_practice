package Task2;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            for(int b=1;b<=10;b++){
             System.out.println(i+"*"+b+"="+(i*b));
            }
         }
    }
}
