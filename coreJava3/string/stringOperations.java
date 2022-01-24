//Question number 3

package javaAssignments;

public class stringOperations {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory.";
		
		//to print the string in lowercase
		System.out.println(str.toLowerCase());
		
		//to print the string in uppercase
		System.out.println(str.toUpperCase());
		
		//to replace 'a' with '$' in every occurrence in string
		System.out.println(str.replace("a","$"));
		
		//to check original string contains 'collection'
		if(str.contains("collection"))
			System.out.println("The original string contains 'collection'.");
		 
		String str2="java string pool refers to collection of strings which are stored in heap memory.";
		//to check if str and str2 are equal using equals() method
		if(str.equals(str2))
			System.out.println("The given strings are equal.");
		else
			System.out.println("The given strings are not equal.");
		
		//to check if str and str2 are equal using equalsIgnoreCase() method
		if(str.equalsIgnoreCase(str2))
			System.out.println("The given strings are equal.");
		else
			System.out.println("The given strings are not equal.");
	}

}
