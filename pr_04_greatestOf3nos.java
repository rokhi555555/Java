import java.util.Scanner;

public class pr_04_greatestOf3nos {
    public static int check3(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else {
         if(b>c){
            return b;
         }
         else {
            return c;
         }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no1");
        int a= obj.nextInt();
        System.out.println("Enter no2");
        int b= obj.nextInt();
        System.out.println("Enter no3");
        int c= obj.nextInt();
       System.out.println("Greatest of three nos"+a+","+b+" and "+c+" is : "+ check3(a, b, c));
    }
}
