package Task5;

public class MultiplicationTable {
    public static void table(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        table();
    }
}
