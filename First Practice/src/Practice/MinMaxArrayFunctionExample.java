package Practice;
import java.util.*;

public class MinMaxArrayFunctionExample {
//	static int min=Integer.MIN_VALUE;
//	static int max=Integer.MAX_VALUE;
	static int mini=Integer.MIN_VALUE;
	static int maxi=Integer.MAX_VALUE;
	static int max(int ar[], int size) {
		for(int i=0;i<size;i++) {
//			if(ar[i]>min) {
//				min=ar[i];
//			}
			mini=Math.max(mini,ar[i]);
		}
//		return min;
		return mini;
	}
		static int min(int ar[], int size) {
			for(int i=0;i<size;i++) {
//			if(ar[i]<max) {
//				max=ar[i];
//				}
				maxi=Math.min(maxi,ar[i]);
			}
//			return max;
			return maxi;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//a[n]- it is not the good practice for providing array size
		int a[]=new int[n];
//		a[5]- always provide a array size during initializing the array
//		int a[]=new int[5];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print(max(a,n));
		System.out.println();
		System.out.print(min(a,n));
	}

}
