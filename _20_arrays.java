import java.util.Scanner;

public class _20_arrays {
    public static void main(String[] args ){
        int[] arr = new int[10]; //method1 of initializing 
        // int arr[]=new int[3];  method2
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.print("Enter nos in array (up-to-10):  ");
           arr[i]= obj.nextInt();
        }
        System.out.println();
        for(int i=0; i<10; i++){
         System.out.print(arr[i]+" ");
        }

        
        // to print size of array
        // System.out.println(arr.length);



        // int arr[]=new int[3];  //declearation 
        //   initialization now
        // arr[2]=5;
        // arr[0]=3;
        // arr[1]=10;
        //shorthend declearation antd initialization 
        // int arr[]={1,3,5};
        // for(int i=0; i<3; i++){
        //     System.out.println(arr[i]);

        // }

    }   
}
