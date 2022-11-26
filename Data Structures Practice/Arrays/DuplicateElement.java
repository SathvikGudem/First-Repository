package Arrays;
import java.util.*;

public class DuplicateElement {
	static void duplicateElement(int ar[],int size) {
		int flag=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(ar[i]==ar[j]) {
					System.out.print(ar[i]+" ");
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.print("No duplicates found");		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		duplicateElement(a,n);
	}

}
