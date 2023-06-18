package Exception_Handling;

public class Try_Catch {
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		int a =20;
		
		try {
			System.out.println(a/0);  //Arithmetic Exception

		} 
		
		catch (ArithmeticException e) {
			System.out.println("Exception Catched" + e.getMessage());
		}
		
		
		String s = null;
		
		try {
			System.out.println(s.length()); //NullPointerException
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}  
		
		
		
		
		
		System.out.println("Program completed");
	}
}
