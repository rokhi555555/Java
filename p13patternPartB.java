
// printing pattern belew
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1 


public class p13patternPartB {
    public static void main(String[] args) {
        int n=1;
        for(int i=5; i>=n; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

