package Task2;

import java.util.Scanner;

public class perfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a perfect square: ");
        int num = sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect square");
        }
    }
    
}
