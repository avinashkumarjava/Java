package java_code;

public class Try {
public static void main(String[] args) {
    int i=50;  
    int j=0;  
    int data;
    int a[]=new int[5];    
    try  
    {  
    	System.out.println(a[6]);
    System.out.println("A");   
    
    System.out.println("B");
    }  
    catch(Exception e) {
    	e.printStackTrace();
    	System.out.println(("C"));
   } 
   
   
    	finally {  
    		System.out.println("D");  
    		}    
    	
    

}  
}