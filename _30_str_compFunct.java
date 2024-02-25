import java.util.Scanner;
public class _30_str_compFunct {
   public static void StrComp(String a,String b){
    if(a.compareTo(b)==0){
      System.out.println("Both are Equal : ");
    }
    else if(a.compareTo(b)>0){
        System.out.println(a+" is greater then "+b);
    }
    else {
        System.out.println(b+" is greater then "+a);
    }
    return;
   }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Eter first string ");
        String str1= obj.nextLine();
        System.out.println("Enter second string : ");
        String str2 =obj.nextLine();
        StrComp(str1, str2);
        
        // if (new String("AA")==new String("AA")) {
        //     System.out.println(" are equal ");
        // }
        // else{
        //     System.out.println("are not equal : ");
        // }
    }
}
