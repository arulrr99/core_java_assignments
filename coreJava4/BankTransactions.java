//Exception- Question number 3


package javaAssignments;
import java.util.*;

public class BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double balance = 0, depositAmount, withdrawAmount;
		while(true) {
			System.out.println("Menu\n1)Deposit cash\n2)Withdraw cash\n3)Balance enquiry\n4)Exit.");
			System.out.println("Enter your choice(1,2,3,4):");
			int ch=input.nextInt();
			if(ch==1) {			
				System.out.println("Enter Deposit amount:");
			    depositAmount =input.nextInt();
			    balance += depositAmount;
		        System.out.println("Deposited successfully.");		    
			}
			else if(ch==2) {
		        System.out.println("Enter Withdraw amount:");
		        withdrawAmount=input.nextInt();
		        try {
			        if(withdrawAmount>balance) {
			        	throw new InsufficientBalanceException();	
			        }
			        if(withdrawAmount<0) {
			        	throw new IllegalBankTransactionException();
			        }
			        balance-=withdrawAmount;
			        System.out.println("Withdraw Successfull. Withdrawn amount="+withdrawAmount);

		        }
		        catch(InsufficientBalanceException ex1) {
		        	ex1.displayIBE("Insufficient balance in your account.");
		        }
		        catch(IllegalBankTransactionException ex2) {
		        	ex2.displayIBT("Illegal bank transaction.Enter positive value.");
		        }	
			}
			else if(ch==3) {
				System.out.println("Balance="+balance);
			}
			else {
				System.out.println("Thank You.");
				break;
			}
			
			
			System.out.println("Do you want to continue?(Y/N):");
			char c=input.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
			
		}


	}

}


//Exception classes.

package javaAssignments;

public class IllegalBankTransactionException extends Exception {
	public void displayIBT(String s) {
		System.out.println(s);
	}

}


package javaAssignments;

public class InsufficientBalanceException extends Exception {
	public void displayIBE(String s) {
		System.out.print(s);
	}
	

}


