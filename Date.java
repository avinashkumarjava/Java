package java_code;
import java.time.LocalDate;
import java.time.LocalTime;
public class Date {
	    
	    


	public static void main(String[] args) { 
	    LocalTime time = LocalTime.now();  

	    LocalDate date = LocalDate.now();    
	    LocalDate yesterday = date.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+date);    
	    System.out.println("Tomorrow date: "+tomorrow);   
	    System.out.println(time);
	  }    
	}    

