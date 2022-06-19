package java_code;

import java.util.Scanner;

public class javacheck {
private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
	System.out.print("Enter a value of p=");
	int p = sc.nextInt();
	System.out.print("Enter a value of r=");
	int r = sc.nextInt();
	System.out.print("Enter a value of t=");
	int t = sc.nextInt();
	{
		float si = (p * r * t) / 100;
		System.out.print(si);

	}
}
}
