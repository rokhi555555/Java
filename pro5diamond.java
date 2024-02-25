/*

 *    
 * print following pattern
 *  *
   ***
  *****
  *****
   ***
    *

 */


public class pro5diamond {
    public static void main(String[] args) {
        //upper part
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     //spaces 
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j-- ){
        //         System.out.print("*");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // for(int j=n-i; j=1; j--){
        //     //     System.out.print(" ");
        //     // }
        //     System.out.println();
        // }
        // //lower part
        // for(int i=n; i>=1; i--){
        //     //spaces 
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j-- ){
        //         System.out.print("*");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // for(int j=n-i; j=1; j--){
        //     //     System.out.print(" ");
        //     // }
        //     System.out.println();
        // }
        // for (int i = 0; i <4; i++) {
        //   for(int j=i; j<4; j++){
        //     System.out.print(i);
        //   }
        //   System.out.println();
        // }
        // for (int i = 4; i >0; i--) {
        //     for(int j=i; j>0; j--){
        //       System.out.print("9");
        //     }
        //     System.out.println();
        //  }
         int n=5;
         //upper half
          for (int i = 0; i <n; i++){
            // spaces 
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
             }
             //stars
             for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
             }
             System.out.println();
          }

          //down half 
          for (int i = n; i >0; i--){
            // spaces 
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
             }
             //stars
             for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
             }
             System.out.println();
          }
    }
}
