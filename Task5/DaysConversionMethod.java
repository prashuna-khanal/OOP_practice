package Task5;

import java.util.Scanner;

public class DaysConversionMethod {
    public static void conversion(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int days = sc.nextInt();
        sc.close();
        
        int years= days/360;
        int months = days%30;
        System.out.println("No. of years: "+years+"\nNo.of months:"+months+"\nNo. of days: "+days);

    }
    public static void main(String[] args) {
        conversion();
    }
}   
