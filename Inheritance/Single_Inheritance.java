package Inheritance;



	class A {
		
		int a;
		int b;
		
		public void display() {
			System.out.println(a+b);
		}
	}
		
	class B extends A {
		
		int x;
		int y;
		
		public void show() {
			System.out.println(x+y);
		}
	}
	
	
public class Single_Inheritance {	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	A aobj = new A();
		aobj.a =120;
		aobj.b =70;
		aobj.display();  */
		
		
		B bobj = new B();
		bobj.x=100;
		bobj.y=200;
		bobj.show();
		
		bobj.a=50;
		bobj.b=200;
		bobj.display();
		
		
		
	}

}
