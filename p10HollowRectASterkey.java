import java.util.Scanner;

public class p10HollowRectASterkey {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First no");
        int a= obj.nextInt();
        System.out.print("Enter second no ");
        int b = obj.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if (i==1 || j ==1 || i==a || j== b) {
                    System.out.print("*");
                    
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}