package Exception_Handling;

public class Checked_Exceptions {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.out.println("Program is started");
		System.out.println("Program in progress");
		
		//Handling using Try-Catch block
	/*	try {
			Thread.sleep(4550);  //InterruptedException

		}
		
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}  */
		
		
		//Handling using Throws keyword
		Thread.sleep(4550); 
		
		System.out.println("Program Completed");
	}
}
