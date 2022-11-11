package Practice;
import java.util.*;

public class FunctionCombinations {
	static int fact(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		return result;
	}
	static int nCr(int n, int r) {
//		First way
//		int num=1, denom1=1, denom2=1;
//		for(int i=1;i<=n;i++) {
//			num=num*i;
//		}
//		for(int i=1;i<=r;i++) {
//			denom1=denom1*i;
//		}
//		for(int i=1;i<=(n-r);i++) {
//			denom2=denom2*i;
//		}
//		int denom = denom1*denom2;
//		int ans = num/denom;
//		return ans;
		
//		Second way
		int a = fact(n);
		int b = fact(r) * fact(n-r);
		int answer = a/b;
		return answer;
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.print(nCr(n,r));
		
	}

}
