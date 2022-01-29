//Generics-> Question number 4


package generics;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> myObj1=new HashMap<String,String>();
		myObj1.put("1","Hello");
		myObj1.put("2","Hai");
		myObj1.put("3","Welcome");
		myObj1.put("4","Fine");
	    for(Map.Entry m:myObj1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());    
	    }
	    
		HashMap<String,Date> myObj2=new HashMap<String,Date>();
		Date d=new Date();
		myObj2.put("1",d);
		
		for(Map.Entry m:myObj2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());    
		}

	}

}
