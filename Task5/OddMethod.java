package Task5;
import java.util.Scanner;

public class OddMethod{
    public static void odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        for(int i =1;i<=num;i++){
            if (i%2!=0){
                System.out.println("Odd numbers are:"+i);
            }
        }
    }
    public static void main(String[] args) {
        odd();
    }
}