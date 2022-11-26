package Arrays;
import java.util.*;

public class SwapAlternateElements {
	static void swapAlternate(int a[], int n) {
		int start=0;
		int end=1;
		int temp;
		for(start=0;end<n;start+=2){
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			end+=2;
		}
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		swapAlternate(ar,n);
	}

}
