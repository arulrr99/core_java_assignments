package java_assignment_1;
import java.util.Scanner;
public class resultDeclaration {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sub1,sub2,sub3;
		System.out.println("Enter the mark of subject 1 :");
		sub1=input.nextInt();
		System.out.println("Enter the mark of subject 2 :");
		sub2=input.nextInt();
		System.out.println("Enter the mark of subject 3 :");
		sub3=input.nextInt();	
		if((sub1>60) && (sub2>60) && (sub3>60))
			System.out.println("The student has passed.");
		else if(((sub1>60) && (sub2>60)) || ((sub1>60) && (sub3>60)) || ((sub2>60) && (sub3>60)))
			System.out.println("The student is promoted.");
		else if(((sub1>60) || (sub2>60) || (sub3>60)) || ((sub1<60) && (sub2<60) && (sub3<60)))
			System.out.println("The student has failed.");
			
	}


}
