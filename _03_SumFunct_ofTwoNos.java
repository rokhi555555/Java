import java.util.Scanner;

public class _03_SumFunct_ofTwoNos {
    public static int Sum(int x,int y){
        int sum= x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner ok= new Scanner(System.in);
        System.out.println("Enter first no ");
        int a= ok.nextInt();
        System.out.println("Enter second no ");
        int b= ok.nextInt();
    System.out.println("Sum of "+ a+" and "+ b +" is :"+Sum(a, b));
    }
}
