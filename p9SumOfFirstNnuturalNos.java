import java.util.Scanner;

public class p9SumOfFirstNnuturalNos {
    public static void main(String[] args) {
        System.out.print("Enter any nutural no");
        int sum=0,counter=0;
        Scanner obj   = new Scanner(System.in);
        int no = obj.nextInt();
        while(counter <=no){
            sum= sum+counter;
            counter++;

        }
        System.out.println("Sum of first "+no+ " nubers is :"+sum);
    }
}
