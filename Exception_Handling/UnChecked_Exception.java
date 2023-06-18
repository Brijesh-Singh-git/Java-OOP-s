package Exception_Handling;

public class UnChecked_Exception {
	
	public static void main(String[] args) {
		
	
	int a =20;
//	System.out.println(a/0);  //Arithmetic Exception
	
	String s = null;
//	System.out.println(s.length()); //NullPointerException
	
	
	String st ="abcede";
	int i = Integer.parseInt(st); 
//	System.out.println(i);   //NumberFormatException
	
	int arr[] = new int[6];
//	arr[10] =556;  // ArrayIndexOutOfBoundsException
	
	
	
	}
}
