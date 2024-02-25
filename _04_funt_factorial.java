// fact n= n*(n-1)(n-2)....*1
import java.util.*;
public class _04_funt_factorial {
    public static int fact(int no){
        if(no<0){
            System.out.println("Invalid number : ");
            return 0;
        }
        int Fact=1;
        for(int i=1; i<=no; i++){
          Fact =Fact*i;
        }
       
        return Fact;
    }
    public static void main(String[] args) {
        Scanner object= new Scanner(System.in);
        System.out.println("Enter any no to print its factorial ");
        int x= object.nextInt();
        // System.out.println(5*4*3*2);
        System.out.println("Factorial of no is :"+fact(x));
    }
}
