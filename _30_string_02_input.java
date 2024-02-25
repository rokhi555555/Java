import java.util.Scanner;

public class _30_string_02_input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
     //takes just word
     //    String name= obj.next();

     //it takes complete
    String name= obj.nextLine();
        System.out.println(name);
        // printing length of string  
    System.out.println("length of string is :"+name.length());
    }
}
