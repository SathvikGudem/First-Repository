package Practice;
import java.util.*;

public class SwitchCalculator {
	public static void main(String[] args) {
		int a,b;
		char c;
		Scanner sc =new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next().charAt(0);
		switch(c){
			case '+':
				System.out.print(a+b);
				break;
			case '-':
				System.out.print(a-b);
				break;
			case '*':
				System.out.print(a*b);
				break;
			case '/':
				System.out.print(a/b);
				break;
			case '%':
				System.out.print(a%b);
				break;
			default:
				System.out.print("Not correct expression");
				
		}
	}
}
