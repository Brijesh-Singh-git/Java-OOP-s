package Access_Modifiers;

class A{
	
/*	private int a;
	
	private void m1() {
		System.out.println(a);
	} */
	
	int a;  // Default access modifier
	
	void m2() {  // Default access modifier
		System.out.println(a);
	}
}


public class AccessModifiers_example {
	public static void main(String[] args) {
		
		A aobj = new A();
//		aobj.a=75;  // cannot access since it is a private
//		aobj.m1();	// cannot access since it is a private
		
		aobj.a=50;
		aobj.m2();
	}
}
