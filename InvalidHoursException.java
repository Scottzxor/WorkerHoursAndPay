
public class InvalidHoursException extends Exception {

	public InvalidHoursException() {
		super("Hours worked must be greater than 0 and less than 84.");
	}
}
