package java_code;
import java.util.*;

public class Trycatch {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a value of a=");
		int a=sc.nextInt();
		System.out.println("enter a value of b=");
		int b=sc.nextInt();
		int d=2;
		int c;
		
		try{
			
			
			System.out.println(c=b/d);
				b=b/a;
				System.out.println("try2 "+b);
		}
		catch(Exception e){
			c=a+b;
			System.out.println("catch value "+c);
		}
finally {
	c=a*b;
	System.out.println("finally value"+c);
}

	}
	}

