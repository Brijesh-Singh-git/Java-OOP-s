package ClassObjects;

public class Static_Example {
	
	int a;    //non-static	
	static int b; // static 
	
	
	void m1() {  //non-static method
		System.out.println("This is a non-static method:- m1");
	} 
	
	static void m2() { //static-method
		System.out.println("This is a static-method:- m2");
	} 
	
	
//	Non-static methods can access everything(static & non-static with direct access)
	void m3() { //non-static method
		m1(); //non-static
		a=230; //non-static
		b=560;//static
		m2();//static 
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) { //static-method 
		
		//Static methods can access only static stuff (Direct)- without any object creation
		/*b=500;
		System.out.println(b);
		m2(); */
		
		
//		Static method can also access the Non-static stuff, but through object creation
		Static_Example s1 = new Static_Example() ;
		
	/*	s1.m1();
		int res =s1.a = 50;
		System.out.println(res); */
		
		
		
		s1.m3();
		
		
	}
}
