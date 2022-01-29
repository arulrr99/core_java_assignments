//OOPS-> Question number 3

//Savings class

package oops;
public class Savings {
	private double fixedDeposit;
	private double balance;
	Savings(){
		setFixedDeposit(0.0);
		setBalance(0.0);
	}
	public double getFixedDeposit() {
		return fixedDeposit;
	}
	public void setFixedDeposit(double fixedDeposit) {
		this.fixedDeposit = fixedDeposit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void totalMoney() {
		System.out.println("Total money in current account="+(fixedDeposit+balance));
		
	}

}

//Current class

package oops;

public class Current {
	private double cashCredit;
	public Current() {
		setCashCredit(0.0);	
	}
	public double getCashCredit() {
		return cashCredit;
	}
	public void setCashCredit(double cashCredit) {
		this.cashCredit = cashCredit;
	}
	public void totalMoney() {
		System.out.println("Total money in current account="+cashCredit);
		
	}
	

}




//Main class
package oops;

public class Bank {
	public static void main(String[] args) {
		Savings s=new Savings();
		Current c=new Current();
		s.setBalance(20000);
		s.setFixedDeposit(100000);
		c.setCashCredit(10000);
		
		
		s.totalMoney();
		c.totalMoney();
	}

}
