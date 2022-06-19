package java_code;
import java.util.Scanner;
 interface InterfaceA {
void getarea();
default void getside() {System.out.println("I can get sides of a polygon.");
}
class Rectangle implements InterfaceA{
	private Scanner sc;

	public void getarea(){
		sc = new Scanner(System.in);
	int l, b;
		 l=sc.nextInt();
		 b=sc.nextInt();
		 int area=l*b;
		 System.out.println("The area of Rectangal=" +area);
	}
class Sqaure implements InterfaceA{
	public void getarea(){
		int l;
		l=sc.nextInt();
		int area=l*l;
		System.out.println("The area of Squre=" +area);
	}
}
}
}


