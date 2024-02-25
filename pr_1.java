//Q1--> enter 3 nos from user and print their avg

import java.util.Scanner;

public class pr_1 {
    public static float avg(int a,int b,int c){
        float avrg= (float)(a+b+c)/3;
        return avrg;
    }
    public static void main(String[] args) {
        Scanner obb= new Scanner(System.in);
        System.out.println("Enter first no :");
        int a=obb.nextInt();
        System.out.println("Enter second no");

        int b=obb.nextInt();
        System.out.println("Enter third no ");
        int c=obb.nextInt();
    System.out.println("Average of three nos is : "+avg(a, b, c));

    }
}
