package Task2;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        sc.close();
        int j = 0;
        for (int i=1;i<=num;i++){
            if (num==1){
                System.out.println("Not prime");
            }
            else if (num%i==0){
                 j+=1 ;
            }
        }
        if(j==2){
            System.out.println("Prime: "+num);
        }else{
            System.out.println("Not prime: "+num);
        }
    }
    
}
