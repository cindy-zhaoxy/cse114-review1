import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = stdin.nextInt();
        
        // assigning to a variable will make your code more readable
        // be sure to give your variables meaningful names so that you can quickly understand when you look back at your code!
        boolean divByFive = (num % 5 == 0);
        boolean divBySix = (num % 6 == 0);
        boolean divByEitherOr = (divByFive || divBySix);
        boolean divByBoth = (divByFive && divBySix);
        boolean divByOnlyOne = (divByFive && !divBySix) || (!divByFive && divBySix); // divided by one of them but not the other
        
        // same as System.out.println("Is " + num + " divisible by 5 and 6? " + divByBoth);
        System.out.printf("Is %d divisible by 5 and 6? %b\n", num, divByBoth); 
        
        // same as System.out.println("Is " + num + " divisible by 5 or 6? " + divByEitherOr);
        System.out.printf("Is %d divisible by 5 or 6? %b\n", num, divByEitherOr); 
        
        // same as System.out.println("Is " + num + " divisible by 5 and 6, but not both? " + divByOnlyOne);
        System.out.printf("Is %d divisible by 5 or 6, but not both? %b\n", num, divByOnlyOne); 
    }
}
