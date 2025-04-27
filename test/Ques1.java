package test;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    sc.close();
    for(int i =1;i<=num;i++){
        if ( i*i == num){
            System.out.println("It's a perfect number "+num);
        }
    }
}
}
