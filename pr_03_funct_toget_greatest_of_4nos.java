import java.util.Scanner;

public class pr_03_funct_toget_greatest_of_4nos {
    public static void check_greatestOf4(int a,int b,int c,int d){
        int sem1,sem2;
        if(a>b){
          sem1=a;
        } else {
            sem1=b;
        }

        if(c>d){
            sem2=c;
          } else {
              sem2=d;
          }

          if(sem1>sem2){
            System.out.println("Greatest of 4 numbers : "+sem1);
          }
          else 
          System.out.println("Greatest of 4 numbers : "+sem2);

          return ;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first no ");
        int a= obj.nextInt();
        System.out.println("Enter second no : ");
        int b= obj.nextInt();
        System.out.println();
        System.out.println("Enter 3rd no");
        int c= obj.nextInt();
        System.out.println("Enter 4th no :");
        int d= obj.nextInt();
       check_greatestOf4(a, b, c,d);
    }
}
