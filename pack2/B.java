package pack2;

import pack1.A;

public class B extends A{
	
	public static void main(String[] args) {
		
	/*	A aobj = new A();
//		aobj.a =5;  // Cannot access as a is default and it is accessible only withon the pacakge
		*/
		
		B bobj = new B(); // we can access protected throuhh inheritance.
		bobj.i = 100;
		bobj.m2();
	}
}
