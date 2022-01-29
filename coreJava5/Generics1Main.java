//Generics-> Question number 1

//Employee class that stores variables
package generics;

public class Employee {
	int id;
	String name,department;
	double salary;
	
	public Employee(int id,String name,String department,double salary){
		this.id=id;
		this.department=department;
		this.name=name;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Employee details:"+"\nId="+id+"Name="+name+"Department="+department+"Salary="+salary);
		
		
	}

}


//Main class to add details of employee to HashSet

package generics;

import java.util.HashSet;

public class Generics1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> emp=new HashSet<Employee>();
        Employee e1=new Employee(101,"Mathews","IT Help",15000);
        Employee e2=new Employee(105,"Angel","Accounts",18000);
        Employee e3=new Employee(107,"John","HR",30000);
        Employee e4=new Employee(110,"Christopher","JFS",25000);
        Employee e5=new Employee(114,"Alex","BU",28000);
        Employee e6=new Employee(115,"Steve","Finance",24000);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        emp.add(e6);
        
        for(Employee e:emp) {
        	e.displayDetails();
        }
        
	}

}
