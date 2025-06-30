package Revision;

public class revision {
    public static void main(String[] args) {
        String str1 = "hello"; // string pool [Memory location same hunxa since same string le paila teskai memory location khojxa ani matra add garxa xaina bhane ]
        String str11 = "hello";
        String str2 = new String("hello"); //new le jaile ni naya memory location ma store hunxa
        String str22 = new String("hello");
        System.out.println(str1==str11); //memory location
        System.out.println(str1.equals(str11));
        System.out.println(str2==str22);
        System.out.println(str2.equals(str22)); //content checking
        int a =3;
        System.out.println(++a + a++); // ++a = 4, a++ = 4 (but a becomes 5 after this operation), so it prints 4 + 4 = 8

    }
}
