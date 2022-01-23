//Question number 6
package java_assignment_1;
import java.util.Scanner;
public class taxPay {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your CTC :");
		double ctc=input.nextDouble();
		double taxAmount;
		if((ctc>0) && (ctc<180000)) {
			System.out.println("You belong to SLAB-A and tax payable is NIL.");
		}
		if((ctc>180000) && (ctc<300000)) {
			taxAmount=(ctc*0.10);
			System.out.println("You belong to SLAB-B and tax payable is "+taxAmount);
		}
		else if((ctc>300000) && (ctc<=500000)) {
			taxAmount=(ctc*0.20);
			System.out.println("You belong to SLAB-C and tax payable is "+taxAmount);
		}
		else if((ctc>500000) && (ctc<=1000000)) {
			taxAmount=(ctc*0.30);
			System.out.println("You belong to SLAB-D and tax payable is "+taxAmount);
		}	
		}
			

}
