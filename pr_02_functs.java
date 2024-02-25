import java.util.Scanner;

public class pr_02_functs {
    public static void circumf(float r){
        double cir= (2*3.14)*r;
        System.out.println("Circumference of circle is :"+cir);

        return;
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter radius here : ");
        float rad = obj.nextFloat();
       circumf(rad);
    }
}
