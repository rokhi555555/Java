import java.util.Scanner;

public class _30_string_operation {
      public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
     //takes just word
     //    String name= obj.next();



     //it takes complete
    String name= obj.nextLine();
        System.out.println("main para:--->"+name);
 //---->        printing length of string  
    // System.out.println("length of string is :"+name.length());




//for pring 1 char using index no 
    // System.out.println(name.charAt(3));
//=------->charArt-->printing characters 1-by-1
// for(int i=0; i<name.length(); i++){
//     System.out.print(name.charAt(i)+" ");
// }

//compares  string1to(str2);
// if str1> str2: +ive
// is str1==str2 :0
// str1<str2: -ive 
System.out.println("Enter second string :");
String name2 = obj.nextLine();
System.out.println(name.compareTo(name2));
}
}
