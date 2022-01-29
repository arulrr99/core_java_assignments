//OOPS->Question number 6

//Persistence class

package oops;

abstract class Persistence {
	public abstract void persist();

}

//FilePersistence class

package oops;

public class FilePersistence extends Persistence {
	public void persist() {
		System.out.println("Data saved in File.");
	}

}


//DatabasePersistence class

package oops;

public class DatabasePersistence extends Persistence {
	public void persist() {
		System.out.println("Data saved in Database.");
	}


}



//Main class

package oops;

public class TestPersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p1=new FilePersistence();
		Persistence p2=new DatabasePersistence();
		p1.persist();
		p2.persist();
		

	}

}
