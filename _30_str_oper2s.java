public class _30_str_oper2s {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Pakistan");
        System.out.println(sc);
        // inserting to string without replacement 

        // sc.insert(0,'S');  //seting in start 
        sc.insert(3,"Snow");   // in middle 
        System.out.println(sc);

    //removing  char from string    delete(start indx,end indx)
 sc.delete(0,4 );
        System.out.println(sc);
    }
}
