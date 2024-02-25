
// pring following pattern   
//     1    
//    212   
//   32123  
//  4321234 
// 543212345

import java.util.Scanner;

public class prob4Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no here : ");
        int n = obj.nextInt();
        // int n=5;
        for(int i=1; i<=n; i++){
            //spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j-- ){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            // for(int j=n-i; j=1; j--){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j-- ){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            // for(int j=n-i; j=1; j--){
            //     System.out.print(" ");
            // }
            System.out.println();
        }

        // for(int i=n; i>=1; i--){
        //     //spaces 
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
