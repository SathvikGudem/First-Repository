package Practice;
import java.util.*;



public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Yes");
			break;
		case 2:
			System.out.println("No");
			break;
		default:
			System.out.println("Test");
		}
	}
}
