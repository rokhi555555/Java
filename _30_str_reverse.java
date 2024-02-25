public class _30_str_reverse {
    public static void main(String[] args) {
        StringBuilder bt = new StringBuilder("Hello");
        System.out.println(bt);
        System.out.println(bt.charAt(0));
        bt.setCharAt(0, 'L');
        System.out.println("checking char at given index :"+bt);
        bt.insert(2, 'm');
        System.out.println("inserting char at given index : "+bt);
        System.out.println("deleting char from given index : ");
        bt.deleteCharAt(2);
        System.out.println(bt);
        System.out.println();
        System.out.println();


        System.out.println("appending  chars ");
        StringBuilder mt= new StringBuilder("P");
        mt.append('a');
        mt.append('k');
        mt.append('i');
        mt.append('s');
        mt.append('t');
        mt.append('a');
        mt.append('n');
        System.out.println(mt);
        System.out.println(mt.length());
        // StringBuilder sb = new StringBuilder("Hello");
        // for(int i=0; i<sb.length()/2; i++){
        //     int front=i;
        //     int back= sb.length()-1-i;

        //     char frontch= sb.charAt(front);
        //     char backch = sb.charAt(back);

        //     sb.setCharAt(front, backch);
        //     sb.setCharAt(backch, frontch);
        // }
        // System.out.println(sb);
    }
}
