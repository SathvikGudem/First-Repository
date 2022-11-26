package Arrays;
import java.util.*;

public class UniqueElementsinArray {
	static void uniqueElement(int a[],int n) {
		for(int i=0;i<n;i++) {
			int flag=0;
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]&& i!=j) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		uniqueElement(ar,n);
	}

}
