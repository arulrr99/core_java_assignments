//OOPS->Question number 5

//Abastract shapes class

package oops;

public abstract class Shapes {
	abstract void draw();

}


//Line class

package oops;

class Line extends Shapes {
	void draw() {
		System.out.println("Drawing a line.");
	}

}


//Rectangle class

package oops;

public class Rectangle extends Shapes {
	void draw() {
		System.out.println("Drawing a rectangle.");
	}

}


//Cube class

package oops;

public class Cube extends Shapes {
	void draw() {
		System.out.println("Drawing a cube.");
	}

}


//Main Class

package oops;

public class TestDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l=new Line();
		Rectangle r=new Rectangle();
		Cube c=new Cube();
		l.draw();
		r.draw();
		c.draw();

	}

}
