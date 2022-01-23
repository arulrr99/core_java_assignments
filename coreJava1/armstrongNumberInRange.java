//Question number 2
package java_assignment_1;

public class armstrongNumberInRange {
	public static void main(String[] args) {
		int temp,last;
		int sum;
		System.out.println("The armstrong numbers falling in the range of 100-999 are as follows : ");
		for(int i=100;i<=999;i++) {
			temp=i;
			sum=0;
			while(temp!=0) {
				last=temp%10;
				sum+=(last*last*last);
				temp/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}	
	}
 }
}	
