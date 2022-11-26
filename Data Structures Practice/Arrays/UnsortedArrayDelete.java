package Arrays;
import java.util.*;

public class UnsortedArrayDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				int position=i;
				if(position==arr.length-1) {
					for(i=position;i<arr.length;i--) {
						arr[i]=arr[i-1];
					}
				}
				else {
					for(i=position;i<arr.length-1;i++) {
						arr[i] = arr[i+1];
					}
				}
			}
			System.out.print(arr[i]+" ");
		}
		
	}
}
