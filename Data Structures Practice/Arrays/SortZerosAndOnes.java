package Arrays;
import java.util.*;

public class SortZerosAndOnes {
	static void sortZerosAndOnes(int ar[], int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(ar[i]==0)
				count++;
		}
		for(int i=0;i<count;i++) {
			ar[i]=0;
			System.out.print(ar[i]+" ");
		}
		for(int i=count;i<size;i++) {
			ar[i]=1;
			System.out.print(ar[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		sortZerosAndOnes(a,n);
		
	}

}
