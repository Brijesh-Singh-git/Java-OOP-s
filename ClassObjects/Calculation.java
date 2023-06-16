package ClassObjects;

public class Calculation {
	
	int a;
	int b;
	
	
//	1. Method without any parameters
	/*void sum () {
		System.out.println(a+b);
	
	} */
	
	
//	2. Method with parameters assigned
	/*void sum( int x, int y) {
		a =x;
		b=y; 
		System.out.println(a+b);
	} */
	
	
	int sum() {
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
//		1. Method without any parameters
		/*cal.a = 100;
		cal.b = 50;
		cal.sum();*/
		
		
//		2. Method with parameters assigned
//		cal.sum(100, 50);
		
		
		cal.a = 100;
		cal.b = 50;
		int res =cal.sum();  // We need to store this result into some variable
		System.out.println(res);
		
	}
}
