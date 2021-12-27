
public class InvalidIDException extends Exception{

	public InvalidIDException() {
		super("ID must not be zero or a negative number");
	}
}
