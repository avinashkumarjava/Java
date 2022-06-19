package java_code;

 abstract class AA {
	 abstract void a();
	 abstract  void b();
	 abstract void c();
	 //abstract void output();
}
class BB extends  AA {
	  public void a(){System.out.print("Safe");} 
	  public void b(){System.out.print("X");}  
	  public void c(){System.out.print("pay");} 
}  
	 /* class CC extends AA{
		  void output(){
	   System.out.print("pay");
	   System.out.print("pay");  
	  }
}*/

// interface  implements