public class Variables {
	public static void main(String[] args) {

		/* TYPES */
		// boolean 
		// short
		// char (8bit) or byte (8bit)
		// int (32bit), long (64bit)
		// float (32bit), double (64bit)
		// byte < short < int < long < float < double

		/* NOT INITIALIZING A VARIABLE */
		double a;
		System.out.println(a);


		/* DECLARING A VARIABLE MORE THAN ONCE */
		double a = 0.0;
		double a = 1.1;


		/* SCOPING */
		{
			double b = 3.3;
		}
		System.out.println(b);


		/* CONSTANTS */
		final double AVOGADRO_NUM = 6.022E23;
		AVOGADRO_NUM = 100.0;


		/* ? */
		int $_ = 5;
        int _3 = 2;

	}
}