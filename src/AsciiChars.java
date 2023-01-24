
public class AsciiChars {

	public static void printNumbers()

	{
		// TODO: print valid numeric input
		for (char value = 49; value < 49 + 10; value++) {
			System.out.println(value);
		}
	}

	public static void printLowerCase() {
		// TODO: print valid lowercase alphabetic input
		for (char lowercase = 97; lowercase < 97 + 26; lowercase++) {
			System.out.println(lowercase);
		}

	}

	public static void printUpperCase() {
		// TODO: print valid uppercase alphabetic input

		for (char uppercase = 65; uppercase < 65 + 26; uppercase++) {
			System.out.println(uppercase);
		}
	}

	public static void main(String[] args) {

		System.out.println("Hello World");

		printNumbers();
		printLowerCase();
		printUpperCase();

	}
}
