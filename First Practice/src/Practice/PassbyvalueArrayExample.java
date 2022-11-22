package Practice;
import java.util.*;

public class PassbyvalueArrayExample {
	static void passByValue(int arr[],int size) {
		for(int i=0;i<size;i++) {
			arr[0]=arr[size-1]+arr[size-2];
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		passByValue(arr,n);
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
