import java.util.Scanner;

public class prob1TableOfAnyNo {
      public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
       
        System.out.print("Enter any no To print its table ");
        int no = obj.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(no + " X "+ i + " = " +(i*no));
        }
    }
}
