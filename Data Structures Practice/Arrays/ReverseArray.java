package Arrays;
import java.util.*;

public class ReverseArray {
	static void reverseArray(int arr[], int size) {
//		int start=0;
//		int end = size-1;
//		int temp;
//		for(start = 0;start<=end;start++) {
//			temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			end--;
//		}
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		reverseArray(a,n);
		
	}

}
