package Arrays;
import java.util.*;

public class UniqueOccurence {
	static void uniqueOccurence(int ar[], int size) {
		int temp;
		for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(ar[i]>ar[j]) {
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
					
				}
//			Arrays.sort(ar);
		}
		int result = 0;
		int b[] = new int[size];
		for(int i=0;i<size;i+=result) {
			int count=1;
			for(int j=i+1;j<size;j++) {
				if(ar[i]==ar[j])
					count++;
					result=count;
			}
			System.out.println(ar[i]+":- "+result);
			for(int k=0;k<=i;k++) {
				b[k]=result;
			}
		}
		int flag=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(b[i]==b[j]&&i!=j)
					flag=1;
				break;
			}
			if(flag==0)
				System.out.print("Unique occurence exists");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		uniqueOccurence(a,n);
	}

}
