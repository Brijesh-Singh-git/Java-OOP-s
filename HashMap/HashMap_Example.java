package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {
	public static void main(String[] args) {
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>(); 
		
		//adding keypairs into hashmap 
		
		hm.put(100, "Mohan");
		hm.put(102, "ROhan");
		hm.put(103, "Shivani");
		hm.put(104, "Russel");
		hm.put(105, "Andrew"); 
		
		
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		hm.remove(104);
		System.out.println(hm);
	}
}
