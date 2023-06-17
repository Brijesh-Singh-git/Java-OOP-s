package Inheritance;

	
class P {
		
		int a;
		int b;
		
		public void display() {
			System.out.println(a+b);
		}
	}
		
class Q extends P {
		
		int x;
		int y;
		
		public void show() {
			System.out.println(x+y);
		}
	}
	
class R extends Q{
		
		int p;
		int q;
		
		public void add() {
			System.out.println(p+q);
		}
	}
	
	
public class MultiLevel_Inheritance {
	
	public static void main(String[] args) {
		
		{
			
		
		/*	A aobj = new A();
		aobj.a =120;
		aobj.b =70;
		aobj.display();  */
		
		
	/*	B bobj = new B();
		bobj.x=100;
		bobj.y=200;
		bobj.show();
		
		bobj.a=50;
		bobj.b=200;
		bobj.display();  */
		
		R cobj = new R();
		cobj.a=70;
		cobj.b=100;
		cobj.x=50;
		cobj.y=60;
		cobj.p=100;
		cobj.q=90;
		
		cobj.display();
		cobj.add();
		cobj.show();;
	}
}
}
