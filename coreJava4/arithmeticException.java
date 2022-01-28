//Exception- Question number 1

package javaAssignments;
import java.util.*;
public class arithmeticException {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
        try {
            System.out.println(x / y); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Divided by zero operation cannot be possible");
        }
        System.out.println("Arul");
	}

}
