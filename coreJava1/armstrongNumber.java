package java_assignment_1;
//question number 1
import java.util.Scanner;

public class armstrongNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=input.nextInt();
		int temp=number;
		int last;
		int sum=0;
		
		//to find the sum of cubes of digits of given number
		while(temp!=0) {
			last=temp%10;
			sum+=(last*last*last);
			temp/=10;
		}
		
		//to check if sum of cubes of digits of given number and the given number are equal
		if(sum==number) {
			System.out.println(number+" is an armstrong number.");
		}
		else
			System.out.println(number+" is not an armstrong number.");
	}

}
