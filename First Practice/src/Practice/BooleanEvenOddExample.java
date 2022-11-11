package Practice;
import java.util.*;

public class BooleanEvenOddExample {
	static int isEvenOdd(int a) {
		if(a%2==0)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(isEvenOdd(n));
	}

}
