package Task2;
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        //String reverse
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        int length=str.length();
        //length of string [apple=5]  
        String reversedString="";  
        // length=1 indexing starts from 0 
        for(int i=length-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        System.out.println(reversedString);
        sc.close();
    }
    
}
