// function to print table of a no

import java.util.Scanner;

public class _02_methods {
    public static void PrintTable(int no){
        for(int i=1; i<11; i++ ){
            System.out.println(no+" X " + i+" = "+i*no);
           
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter any no to print its table :");
        Scanner obj = new Scanner(System.in);
        int number= obj.nextInt();
        PrintTable(number);
        
    }
}
