/**
 * 
 */
package assignment3_3;

/**
 * @author MANJUNATH, This class is the parent class.. to demonstrate
 *         Constructor Chaining. Between the same class and between the child
 *         and parent class.
 *
 */
public class Assignment3_3 {

	/**
	 * 
	 */
	// Default Constructor (Parent Class constructor)
	Assignment3_3() {
		this("Hello"); // Calling Same class parameterized constructor
		System.out.println("Exited Parent Default Constructor");
	}

	Assignment3_3(String value) { // Parameterized Constructor (Parent Class constructor)
		System.out.println("Parent Constructor with parameter value - " + value);
	}

	// Main Function
	public static void main(String[] args) {
		new Assignment3_3();
	}

}
