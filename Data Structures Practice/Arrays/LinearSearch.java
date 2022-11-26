package Arrays;
import java.util.*;

public class LinearSearch {
	static void linearSearch(int ar[], int size, int element) {
//		boolean a = true, b= false;
		int flag=0;
		for(int i=0;i<size;i++) {
			if(ar[i]==element) {
				System.out.print("Element is found at: "+(i+1)+"th position");
//				return a;
				System.out.println();
				flag++;
			}
		}
//		return b;
		System.out.print(flag);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int key = sc.nextInt();
		linearSearch(a,n,key);
	}

}
