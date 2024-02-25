import java.util.*;
public class ifStatement {

  public static void main(String[] args) {
    // int age;
    System.out.print("Enter your age :");
    Scanner sc =new Scanner(System.in);
    int age = sc.nextInt();
    if (age>18) {
        System.out.println("Adult ");
    } else {
        System.out.println("Not Adult");
    }

  }
    
}