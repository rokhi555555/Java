import java.util.*;
public class p4Elseif {
    public static void main(String args[]){
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter first no (a)");
     int a = obj.nextInt();
     System.out.println("Enter second no (b)");
     int b = obj.nextInt();
     if(a==b){
        System.out.println("a is equal to b");
     } else if (a>b) {
        System.out.println("a is greater then b");
     } else
      System.out.println("a is less then b");
    }
}
