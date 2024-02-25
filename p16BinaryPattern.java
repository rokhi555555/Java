// problem to print below pattern
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
public class p16BinaryPattern {
    public static void main(String[] args) {
        int n=5,m=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int p=j+i;
                int q;
                if(p%2==0){
                 q=1;
                }
                else{
                    q=0;
                }
                System.out.print(q+" ");
                
            }
            System.out.println();
  

             }
    }
}
