package Arrays;
import java.util.*;

public class UnsortedArraySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int arr[] = new int[rows];
		for(int i=0;i<rows;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Element found at position: "+(i+1));
			}
//			else {
//				System.out.println("Element not found");
//			}
		}
		
	}


}
