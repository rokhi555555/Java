import java.util.*;
public class p5Switch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first no :");
        int a = obj.nextInt();
        System.out.print("Enter second no :");
        int b = obj.nextInt();
        System.out.println("         Enter your choice \n1->To add\n2->To Subtract \n3->To multiply \n4->To Divide  ");
        int choice =obj.nextInt();
       switch(choice){
        case 1: System.out.print("Sum of two nos is : ");
           int sum= a+b;
           System.out.println(sum);
            break;
        case 2:
           int diff = a-b;
           System.out.print("difference of two nos is : ");
           System.out.println(diff);
           break;
        case 3:
           int product = a*b;
           System.out.print("Product  of two nos is : ");
           System.out.println(product);
           break;
        case 4:
           int quotient = a/b;
           System.out.print("Quotient of two nos is : ");
           System.out.println(quotient);
           break;
        default: System.out.println("Wrong Selection");


        }
    }
}
