public class p12180degPatttern {
    public static void main(String args[]){
        int n=4;
        for(int j=1; j<=n; j++){
        for(int i=1; i<=n-j; i++){
            System.out.print(" ");
        }
        for(int i=1; i<=j; i++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
