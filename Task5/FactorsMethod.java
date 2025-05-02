package Task5;

import java.util.Scanner;

public class FactorsMethod {
    public static void factors(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        factors();
    }
}
