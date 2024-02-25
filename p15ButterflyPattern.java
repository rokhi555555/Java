//printing 
//             *        *
//             **      **
//             ***    ***
//             ****  ****
//             **********
//             **********
//             ****  ****
//             ***    ***
//             **      **
//             *        *


public class p15ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for(int k=1; k<=n; k++){
            for(int i=1; i<=k; i++){
           System.out.print("*");
            }
            //spaces 
            int spaces = 2*(n-k);
            for(int i=1; i<=spaces; i++){
             System.out.print(" ");
             }

             //second part stars
             for(int i=1; i<=k; i++){
                System.out.print("*");
                 }
                 System.out.println();
        }
        
        //Second half 
        for(int k=n; k>=1; k--){
            for(int i=1; i<=k; i++){
           System.out.print("*");
            }
            //spaces 
            int spaces = 2*(n-k);
            for(int i=1; i<=spaces; i++){
             System.out.print(" ");
             }

             //second part stars
             for(int i=1; i<=k; i++){
                System.out.print("*");
                 }
                 System.out.println();
        }
    }
}
