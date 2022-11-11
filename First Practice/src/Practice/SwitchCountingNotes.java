package Practice;
import java.util.*;

public class SwitchCountingNotes {
	public static void main(String[] args) {
		int x = 0,y = 0,z = 0,m = 0;
		int num=1;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch (num){
			case 1 :
				x=n/100;
				n=n-x*100;
				System.out.println("Number of 100 rupees notes:"+x);
				y=n/50;
				n=n-y*50;
				System.out.println("Number of 50 rupees notes:"+y);
				z=n/20;
				n=n-z*20;
				System.out.println("Number of 20 rupees notes:"+z);
				m=n/1;
				n=n-z*1;
				System.out.println("Number of 1 rupee coins:"+m);
				break;
			default:
				System.out.print("No notes");
		
		}
		int a = x+y+z+m;
		System.out.print("Total number of all notes:"+a);
		
	}

}
