package Practice;
import java.util.*;

public class PrimeNumbers {
	static boolean isPrimeNumber(int n) {
		for(int i=2;i<n;i++) {
			if (n%i==0)
				return false;
				
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPrimeNumber(n);
		System.out.print(isPrimeNumber(n));
		
	}

}
