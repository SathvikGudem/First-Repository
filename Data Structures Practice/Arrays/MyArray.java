package Arrays;
import java.util.*;

class OneDimensionalArray {
	int rollno;
	String name;
	OneDimensionalArray(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
}
public class MyArray{
		public static void main(String[] args) {
			OneDimensionalArray a[]= new OneDimensionalArray[4];
			a[0]= new OneDimensionalArray(1,"Sathvik");
			a[1]= new OneDimensionalArray(2,"HP");
			a[2]= new OneDimensionalArray(3,"Dell");
			a[3]= new OneDimensionalArray(4,"Lenovo");
			for(int i=0;i<a.length;i++) {
				System.out.println("Array place:"+"\t"+a[i].rollno+"\n"+"Array value:"+"\t"+a[i].name);
				//if null should not be displayed
				if(a[i]==null) {
					continue;
				}
			}
			
			
	}
}