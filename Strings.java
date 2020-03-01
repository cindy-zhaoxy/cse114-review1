public class Strings {
	public static void main(String[] args) {

		/** STRINGS ARE OBJECTS, NOT PRIMITIVE VALUES **/
		String a = new String("compare me");
		String b = new String("compare me");
		System.out.println(a == b);


		/* STRINGS AND IMMUTABILITY */
		String s = "Hello, World!";
		System.out.println(s);
		s = "Goodbye, World!";
		System.out.println(s);

		/** COMPARING STRINGS **/
		String a = new String("compare me");
		String b = new String("compare me");
		System.out.println(a.equalsTo(b));

		String a = new String("compare me");
		String b = new String("compare me");
		System.out.println(a.compareTo(b));

		a = "New York City";
		b = "Chicago";
		System.out.println(a.compareTo(b));

		a = "Atlanta";
		b = "Pennsylvania";
		System.out.println(a.compareTo(b));		


		/** STRING INTERNMENT **/
		String a = "Hello, World!";
		String b = "Hello, World!";
		System.out.println(a == b);


		/** COMMON STRING FUNCTONS **/
		String a = "What\'s the value?";
		System.out.println(a.charAt(4));
		System.out.println(a.substring(5));
		System.out.println(a.substring(5, a.length()));
		System.out.println(a.indexOf("h"));
		System.out.println(a.indexOf("!"));

	}
}