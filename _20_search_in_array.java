import java.util.Scanner;

public class _20_search_in_array {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,9};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no to be Searched : ");
        int num = obj.nextInt();
            for(int i=0; i<arr.length; i++){
            // System.out.println(arr[i]);
            if (arr[i]==num) {
                // index= i;
                System.out.println("No is at index "+i);
                break;
            } 
            
           
        }
       
    }
}
