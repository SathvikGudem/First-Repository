package Arrays;
import java.util.*;

public class UnsortedArrayInsert {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int rows = sc.nextInt();
		int arr[] =  new int[rows];
		for(int i=0;i<rows;i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		int max=rows+1;
		for(int i=0;i<rows;i++) {
			System.out.print(arr[i]+" ");
			if(i==rows-1) {
				System.out.print(x);
			}
		}
		
	}

}
