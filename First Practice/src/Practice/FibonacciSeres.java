package Practice;
import java.util.*;

public class FibonacciSeres {
	static void fibonacciSeries(int n) {
		int a=0, b=1, c;
		int ar[] = new int[n];
		int i;
		for(i=0;i<=n-1;i++) {
			if (i==0) {
				ar[i]=a;
				
			}
			else if(i==1){
				ar[i]=b;
			}
			else {
				c=a+b;
				ar[i]=c;
				a=b;
				b=c;
			}
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		 
		System.out.println(ar[n-1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacciSeries(n);
	}

}
