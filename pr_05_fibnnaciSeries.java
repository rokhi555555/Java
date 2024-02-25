//print fibnnaci series untill no n
//   0,1,1,2,3,5,8,13,21,34,55
// fib3= fib2+fib1

//fibN =fib(n-1)+ fib(n-2)

import java.util.Scanner;

public class pr_05_fibnnaciSeries {
    public static int fib(int n){
        int s;
        if(n==0||n==1){
        if(n==0){
			s=0;
		}
		if(n==1){
			s=1;
		}
        }
   int fibn1=fib(n-1);
   int fibn2= fib(n-2);
   int Fib = fibn1+fibn2;
   return Fib;

    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter any no : ");
        int a= obj.nextInt();
        System.out.println("Fibnnaci term of no"+a+" is : "+fib(a));
        /*
         * int fib(int n){

		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
	int fibNm1 = fib(n-1);
	int fibNm2 = fib(n-2);
	int fibN = fibNm1 + fibNm2;
//	printf("fibonacci sequesce of %d is :%d\n",n,fibN);
	return fibN;
}
         */
    }    
}
