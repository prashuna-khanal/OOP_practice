package Task2;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks(1st): ");
        int first=sc.nextInt();
        System.out.println("Enter the marks(2nd): ");
        int second=sc.nextInt();
        System.out.println("Enter the marks(3rd): ");
        int third=sc.nextInt();
        System.out.println("Enter the marks(4th): ");
        int fourth=sc.nextInt();
        System.out.println("Enter the marks(5th): ");
        int fifth=sc.nextInt();
        sc.close();
        int obtained=first+second+third+fifth+fourth;
        float percentage = ((float) obtained/500)*100;
        if (percentage>=90){
            System.out.println("Grade:A+ \n Obatained marks: "+ obtained);
        }else if (percentage>=80){
            System.out.println("Grade:A \n Obatained marks: "+ obtained);
        }else if (percentage>=70){
            System.out.println("Grade:B+ \n Obatained marks: "+ obtained);
        }else if (percentage>=60){
                System.out.println("Grade:B \n Obatained marks: "+ obtained);
        }else if (percentage>=50){
            System.out.println("Grade:C+ \n Obatained marks: "+ obtained);
        }else if (percentage>=40){
            System.out.println("Grade:C \n Obatained marks: "+ obtained);}

        else{
            System.out.println("Grade:fail \n Obatained marks: "+ obtained);
        }
    }
    
}
