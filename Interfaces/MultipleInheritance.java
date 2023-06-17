package Interfaces;

interface A {  //Parent
	int a = 10;
	void display(); //abstract method
} 

interface B { //Parent
	int b=60;
	void show();  //abstract method
}



public class MultipleInheritance implements A,B {  //Child

	public void display() {
		System.out.println(a);
	
} 
	
	public void show() {
		System.out.println(b);
}
	
	public static void main(String[] args) {
		
		MultipleInheritance m1 = new MultipleInheritance();
		m1.display();
		m1.show();
	}
}
