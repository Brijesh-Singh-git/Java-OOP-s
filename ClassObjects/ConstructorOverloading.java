package ClassObjects;

public class ConstructorOverloading {
		
	int a = 0;
	int b = 0; 
	double c = 0;
	
	
	ConstructorOverloading(){  // First
		
		a =67;
		b=90;
		c=87;
		
	}
	
	
	ConstructorOverloading(int x, double y){  // Second
		a =x;
		c=y;
		
	}
	
	
	ConstructorOverloading(int x, int y, double z){  // Third
		
		a=x;
		b=y;
		c=z;
	}
	
	
	// Here we just interchanged the order
	ConstructorOverloading(int x, double y, int z){  // Fourth
		
		
		a=x;
		c=y;
		b=z;
	}
	
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	
	public static void main(String[] args) {
		
//		ConstructorOverloading  co = new ConstructorOverloading();  // Call the first Constructor
		
//		ConstructorOverloading  co = new ConstructorOverloading(50,87);  // Call the second Constructor
		
//		ConstructorOverloading  co = new ConstructorOverloading(50,87,75);  // Call the third Constructor 
		
		ConstructorOverloading  co = new ConstructorOverloading(70,9.6,75);  // Call the fourth Constructor
		
		
		
		co.display();
		
	}
}
