package Task2;
import java.util.Scanner;

public class sumtill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        // SUM till the number
        int sum=0;
        for(int i=1;i<=num;i++){
            
            sum+=i;
        }System.out.println(sum);
    }
    
}
