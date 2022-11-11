package Practice;
import java.util.*;

public class FunctionExample {
	static int power(int a,int b) {
		
		int ans=1;
		for(int i=1;i<=b;i++) {
			ans=ans*a;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int answer = power(num1,num2);
		System.out.print(answer);
	}

}
