//OOPS-> Question number 2

//Abstract Employee class

package oops;

public abstract class Employees {
	public abstract double getTotalSalary();

}

//Manager class 

package oops;

public class Manager extends Employees {
	public double incentive;
	public double salary;
	public double totalSalary;
	Manager(double i,double s) {
		incentive=i;
		salary=s;
		
	}
	public double getTotalSalary() {
		totalSalary=salary+incentive;
		return salary+incentive;
	}

}

//Labour class

package oops;

public class Labour extends Employees {
	public double salary;
	public double overtime;
	public double totalSalary;
	public Labour(double s,double o) {
		salary=s;
		overtime=o;
	}
	
	public double getTotalSalary() {
		totalSalary=salary+(overtime*100);
		return totalSalary;
	}


}


//Main class

package oops;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(10000.0,30000.0);
		Labour l=new Labour(10000,9);
		System.out.println(m.getTotalSalary());
		System.out.println(l.getTotalSalary());
		System.out.println("Total salary amount="+(m.getTotalSalary()+l.getTotalSalary()));
	}

}
