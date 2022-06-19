package java_code;
import java.util.*;

public class SFDHGJ {

private static Scanner scan;

public static void main(String[] args) {
	List<String> list=new ArrayList<String>();  
	 list.add("Mobaile");
	 list.add("Laptop");
	 list.add("Desktop");

	 list.add("Refirgetar");

	 list.add("Washing Mashin");

	 list.add("Outher");
	 System.out.println("Select any product");
	 System.out.print("Electronic Product ");
System.out.println(list);

List<String> list1=new ArrayList<String>();  
list1.add("Men ");
list1.add("Women");
list1.add("Child");

list1.add("Girls");

list1.add("Boys");

list1.add("Outher");
list1.size();
System.out.print("Clouth Product ");

System.out.println(list1);
scan = new Scanner(System.in);
System.out.println("Enter product name");
ArrayList<String> list2 = new ArrayList<String>();
while(scan.hasNext()){
   list2.add(scan.next());
}
String[] S = new  String[list.size()];

S = list.toArray(S);
for(int i = 0;i<=5; i++){
System.out.println(S[i]);
}
}
}
