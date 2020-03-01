import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);

		/* IF, ELSE IF, ELSE */

		/* IFs */
		System.out.print("Enter your age: ");
		int age = stdin.nextInt();
		if (age < 0) 
			System.out.println("That's not a valid age!");
		if (age >= 18) {
			System.out.println("You're an adult.");
		}
		if (true);
		else {
			System.out.println("...");
		}

		/* DIFFERENCE BETWEEN IFs AND IF, ELSE IF */
		if (age < 0) {
			System.out.println("That's not a valid age!");
		} else if (age >= 18) {
			System.out.println("You're an adult.");
		} else if (age >= 65) {
			System.out.println("You're a senior.");
		} else {
			System.out.println("...");
		}

		/* TERNARY OPERATOR */
		boolean doneWithSlides = true;
		String s = !doneWithSlides ? "not done :(" : "done!!";
		System.out.println(s);;;;;

		/* SWITcH CASE */

		int three = 3;
		switch (three) {
		    case 3:
			System.out.println("three");
		    case 4:
			System.out.println("four");
		    default:
			System.out.println("no");
		}

		String s = "switch case";
		switch (s) {
		    case s.compareTo("SWITCH CASE") > 0:
			System.out.println("Yes");
			break;
		    default:
			System.out.println("No");
		}

		String s = "switch case";
		switch (s) {
		    case s.compareTo("SWITCH CASE") > 0:
			System.out.println("yes");
			break;
		    default:
			System.out.println("no");
		}

		String s = "Hello, World";
		switch (s) {
		    case 1:
			System.out.println("yes");
			break;
		    default:
			System.out.println("no");
		}

	}
}
