package java_code;
  import java.util.Scanner;
  
class Qube{  
private static Scanner sc;

public static void main(String args[]){  
	sc = new Scanner(System.in);
	System.out.println("Enter Any number=");
	int a=sc.nextInt();
Draw d=new Rect();  
d.draw();  
System.out.println(Draw.cube(a));  
}} 



