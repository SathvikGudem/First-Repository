package Practice;
import java.util.*;

public class CountingNumbers {
	//Function Signature
	static void countingNumbers(int n) {
		//Function Body
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Function Call
		countingNumbers(n);
	}

}
