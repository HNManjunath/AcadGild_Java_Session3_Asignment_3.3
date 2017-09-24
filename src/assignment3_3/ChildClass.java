/**
 * 
 */
package assignment3_3;

/**
 * @author MANJUNATH, below class is the child class which extends the parent class.
 *
 */
public class ChildClass extends Assignment3_3 {

	// Child default Constructor
	ChildClass() {
		super("Hello from Child"); // Calling Parent Parameterized Constructor
		System.out.println("Exited Child Default Constructor");
	}

	// Main Function
	public static void main(String[] args) {
		new ChildClass();
	}

}
