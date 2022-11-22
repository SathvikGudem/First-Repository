package Practice;
import java.util.*;

public class SetBits {
	static void setBits(int a,int b) {
		int count1=0, count2=0;
		while(a!=0) {
			count1+= (a&1);
			a=a >> 1;
		}
		while(b!=0) {
			count2+= b&1;
			b = b >> 1;
		}
//		return count;
		System.out.print(count1+count2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		setBits(a,b);
	}

}
