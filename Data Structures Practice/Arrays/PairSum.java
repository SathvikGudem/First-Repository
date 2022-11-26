package Arrays;
import java.util.*;

public class PairSum {
	static void pairSum(int ar[], int n, int sum) {
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]+ar[j]==sum) {
					System.out.print("Pair sum exists with numbers at index:"+" "+i+" "+j);
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.print("Pair sum does not exist in the array");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		pairSum(a,n,x);
	}

}
