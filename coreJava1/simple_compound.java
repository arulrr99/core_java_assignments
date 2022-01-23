//Question number 3
package java_assignment_1;
import java.util.Scanner;
public class si_ci {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double principle,rate,time,simple,compound;
		System.out.println("Enter principle amount :");
		principle=input.nextDouble();
		System.out.println("Enter rate :");
		rate=input.nextDouble();
		System.out.println("Enter time :");
		time=input.nextDouble();
		simple=(principle*rate*time)/100;
		compound=principle*Math.pow(1.0+rate/100.0, time)-principle;
		System.out.println("Simple Interest="+simple);
		System.out. println("Compound Interest="+compound);
		
	}

}
