
public class Assignment2 {
	/*
	 * Print reverse of a given String value.
	 * 
	 */

	public static void main(String[] args) {

		String theString = "Make me backwards!";

		Assignment2 as2 = new Assignment2();

		theString = as2.inverter(theString);

		System.out.println(theString);
	}

	public String inverter(String input) {
		String output;
		StringBuilder sb = new StringBuilder(input);

		sb.reverse();

		output = sb.toString();

		return output;

	}

}
