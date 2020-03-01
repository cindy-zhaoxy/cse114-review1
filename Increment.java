public class Increment {
	public static void main(String[] args) {

		/* ? */
		int i=2;
		i = i++ + ++i;
		System.out.println (i);

		/* ? */
		int a = 5;
		int b = 1;
		b = a++ - b-- + a++;
		System.out.println (b);
	}
}