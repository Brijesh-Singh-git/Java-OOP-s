package ClassObjects;

public class MethodOverloading {
	
	int a = 100;
	int b = 150 ;
	

	void sum() {
		System.out.println(a+b);
		
	}
	
	
	void sum(int a, int b) {
		
		this.a=a;               //(this) keyword is used to eliminate the confusion 
		this.b=b;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.sum(); // It will call the first Method 
		mo.sum(120, 30); // It will call the second Method 
		mo.sum(50, 70, 20); // It will call the third Method 
		mo.sum(70, 50.5); // It will call the fourth Method 
		
		
		
	}
}
