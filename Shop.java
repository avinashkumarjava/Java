package java_code;
import java.util.*;
 class Electronic {
		
	
	void input(){
		List<String> list=new ArrayList<String>();  
	 list.add("Mobaile");
	 list.add("Laptop");
	 list.add("Desktop");

	 list.add("Refirgetar");

	 list.add("Washing Mashin");

	 list.add("Outher");
//System.out.println(list);


	
}}
  
abstract class Clouth{
	
	void input(){
		List<String> list=new ArrayList<String>();  
		 list.add("Men ");
		 list.add("Women");
		 list.add("Child");

		 list.add("Girls");

		 list.add("Boys");

		 list.add("Outher");
	}
	
}
public class Shop extends Clouth{
	public static void main(String[] args) {
		Electronic e = new Electronic();
		
		// Clouth C = new Clouth();
		System.out.println(e);
		
		//System.out.println(C);
		
		
	}
	
	
}
