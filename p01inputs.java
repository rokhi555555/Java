import java.util.*;
public class p01inputs {
    public static void main(String[] args) {
        //input
        System.out.println("Enter your name here : ");
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        // String name = sc.next();//will print asad only from asad khan
        String name = sc.nextLine();//will print complete line
        System.out.println(name);
    }
}
