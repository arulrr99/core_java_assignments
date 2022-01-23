//Question number 7
package java_assignment_1;
import java.util.Scanner;
public class linearSearch {
	public static void main(String[] args) {
		int[] array=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the element to search in the array :");
		int element=input.nextInt();
		int flag=0;
		for(int i=0;i<array.length;i++) {
			if(element==array[i]) {
				System.out.println("The element is found in the array at the loaction "+(i+1));
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("The element is not found in the array.");
		
		
	}
	

}
