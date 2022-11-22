package Practice;
import java.util.*;

public class SumofElementsinArray {
	static void sumElementsArray(int ar[], int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=ar[i];
		}
		System.out.print(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sumElementsArray(a,n);
	}
}
