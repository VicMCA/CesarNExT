package main.exceptions;

public class CustomerNotFoundException extends Exception {

	private static final long serialVersionUID = 2228140750354024062L;
	
	public static String message = "Customer not found";
	
	public CustomerNotFoundException() {
		super(message);
	}
}
