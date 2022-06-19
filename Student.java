package java_code;

import java.util.Scanner;

interface Triangal{
	Scanner sc=new Scanner(System.in);

	int a=sc.nextInt();
	int b=sc.nextInt();
	
}
class Student implements Triangal{
	public static void main(String[] args) {
		System.out.println("Enter value of a=");
		System.out.println("Enter value of b=");
		int c=(a*a)+(b*b);
		double d = Math.sqrt(c);
		
		System.out.println(d);
	}
}
