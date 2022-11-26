package Arrays;
import java.util.*;

public class IntersectionofArrays {
	static void intersectionOfArrays(int a[], int b[], int size1, int size2) {
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}	
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		for(int j=0;j<n2;j++) {
			a2[j]=sc.nextInt();
		}
		intersectionOfArrays(a1,a2,n1,n2);
	}

}
