package Arrays;
import java.util.*;

public class TripletSum {
	static void tripletSum(int ar[], int n, int target) {
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(ar[i]+ar[j]+ar[k]==target) {
						System.out.println("Triplet sum exists with numbers at index:"+" "+i+" "+j+" "+k);
						flag=1;
					}
				}
			}
		}
		if(flag==0) {
			System.out.print("Triplet does not exists in the array");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		sc.close();
		tripletSum(a,n,x);
	}

}
