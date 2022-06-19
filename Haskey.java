package java_code;
import java.util.*;

public class Haskey {
	public static void main(String[] args) {
	    Hashtable<String, Integer> ht = new Hashtable<>();
	    
	    ht.put("Electronic",1);
	    ht.put("Clouth",2);
	    ht.put("Outher",3);

	    
        for (Map.Entry<String, Integer> e : ht.entrySet())
        	System.out.println(e.getKey() + " " + e.getValue());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        ArrayList<String> list = new ArrayList<String>();
        while(scan.hasNext()){
           list.add(scan.next());
        }
        String[] S = new  String[list.size()];

        S = list.toArray(S);
        for(int i = 0;i<=5; i++){
        System.out.println(S[i]);
        }

	}

}
