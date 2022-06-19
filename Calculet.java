package java_code;
import java.util.Scanner;
class Calculet {
private static Scanner sc;
static int cube (int x){
	return x*x*x;
}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int cube = sc.nextInt();
int result=Calculet.cube(cube);
System.out.println(result);
	}

}
