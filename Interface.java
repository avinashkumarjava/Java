package java_code;
abstract class  A{  
	abstract void a();  
	abstract void b();  
	abstract void c();  
	abstract void d();  
}  
  abstract class C {
	  abstract void e();
	  abstract void f();
	  abstract void g();
  }
  abstract class D {
	  abstract void h();
	  abstract void i();
	  abstract void j();
  }
abstract class B extends  A{  
public void c(){System.out.println("I am c");}  
}  
  class N extends C{
	  public void e(){System.out.println("I am e");}  
	  public void f(){System.out.println("I am f");}  
	  public void g(){System.out.println("I am g");}  
  
  }
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
} 
class O extends D{  
public void h(){System.out.println("I am h");}  
public void i(){System.out.println("I am i");}  
public void j(){System.out.println("I am j");}  
} 
  

class Interface{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
N b=new N();
b.e();
b.f();
b.g();
O c=new O();
c.h();
c.i();
c.j();
}} 

