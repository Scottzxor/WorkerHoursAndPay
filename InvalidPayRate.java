
public class InvalidPayRate extends Exception {
	
	public InvalidPayRate() {
		super("Pay rate must be a positive number less than 25");
	}

}
