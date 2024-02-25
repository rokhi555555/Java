import java.util.Scanner;


public class _20_2dArrays {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter no of rows in 2d array ");
        int a= obj.nextInt();
        System.out.println("Enter no of coloumns  in 2d array ");
        int b= obj.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.println("Enter no in 2d array :--> ");
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println(">--------<(0)>---------<");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter no to be searched : ");
        int n= obj.nextInt();
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
               if(arr[i][j]==n){
                System.out.println(" no is found at index : "+"arr["+i+"]["+j+"]");
               }
            }
           
        }

    }
}
