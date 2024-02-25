import java.util.Scanner;

public class p8WhileLoop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no to Print :");
        int number_1 = obj.nextInt();
        while (number_1<10) {
            System.out.println(number_1);
            number_1++;
        }
        // int i=obj.nextInt();
        // while (i<10) {
        //     System.out.println(i);
        //     i++;
        // }
    }
}
