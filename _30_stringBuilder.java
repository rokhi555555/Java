public class _30_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Quaid");
        sc.append(" Azam");
        System.out.println(sc);
        System.out.println("at index 3 : "+sc.charAt(3));

        //to replace a char 
        sc.setCharAt(0, 'y');
        System.out.println(sc);
    }
}
