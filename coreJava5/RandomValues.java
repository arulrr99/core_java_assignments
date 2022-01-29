//Generics-> Question number 2


package generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer , Double> randomMap= new HashMap<>();
	     Random r = new Random();

	     for(int i = 1 ; i <= 10 ; i++){
	    	 int key = r.nextInt();
	         double value = r.nextDouble();
	         randomMap.put(key,value);
	            
	     }

	     for(Map.Entry entry : randomMap.entrySet()){
	         System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
	     }

	}

}
