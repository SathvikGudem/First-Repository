package Practice;
import java.util.*;

public class ArithmeticProgression {
	static void arithmeticProgression(int n) {
		for(int i=0;i<=n;i++) {
			int ans = 3*i+7;
			System.out.print(ans+" ");
		}
		
//		int ans = 3*n+7;
//		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arithmeticProgression(n);
		
//		System.out.print(arithmeticProgression(n));
		
	}
}
