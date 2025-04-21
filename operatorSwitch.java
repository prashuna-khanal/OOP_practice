package Task2;
import java.util.Scanner;

public class operatorSwitch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // CALCULATIONS
            System.out.print("Enter the first number: ");
            int first_num= sc.nextInt();
            System.out.println("Enter the second number: ");
            int second_num= sc.nextInt();
            System.out.println("Enter the operator: ");
            char operator= sc.next().charAt(0);
            sc.close();
            switch(operator){
                case '+':
                    System.out.println(first_num+"+"+second_num+"="+(first_num+second_num));
                    break;
                case '-':
                    System.out.println(first_num+"-"+second_num+"="+(first_num-second_num));
                    break;
                case '*':
                    System.out.println(first_num+"*"+second_num+"="+(first_num*second_num));
                    break;
                case '/':
                if(second_num!=0){
                    System.out.println("Second number must not be 0 !!");
                }else{
                    System.out.println(first_num+"/"+second_num+"="+(first_num/second_num));
                }
                    break;
                default:
                    System.out.println("Invalid operator entered");
                    break;
                }
    }
    
}
