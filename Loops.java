import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);

        /* FOR */
        System.out.print("Enter your age: ");
        for (int age = stdin.nextInt(); age != 50; age = stdin.nextInt()) {
            System.out.printf("You are %d\n", age);
            System.out.print("Enter your age: ");
        }

        /* WHILE */
        System.out.print("Enter your age: ");
        int age = stdin.nextInt();
        System.out.printf("You are %d\n", age);
        while (age != 50) {
            System.out.println("Enter your age: ");
            age = stdin.nextInt();
            System.out.printf("You are %d\n", age);
        }
        
        /* DO-WHILE */
        int age;
        do {
            System.out.print("Enter your age: ");
            age = stdin.nextInt();
            System.out.printf("You are %d\n", age);
        } while (age != 50);

        /* NESTED LOOPS */

        int iter = 0;
        for (int i = 0; i < 5; i++) {
            while (iter != 5) {
                System.out.println(iter++);
            }
        }

        int iter = 0;
        for (int i = 0; i < 5; i++) {
            while (iter != 5) {
                System.out.print(iter++ + " ");
            }
            iter = 0;
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
        }

        /* BREAK */
        for (int i = 0;; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        /* CONTINUE */
        for (int i = 0; i <= 25; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        /* SCOPING */
        for (int i = 0; i < 10; i++) {
            double sum += (Math.random() * 50);
        }
        System.out.println(sum);

         for (int i = 1; i < 2; System.out.println(i++));

        /* ONE-LINER */
        for (int i = 0; ; i++)
          System.out.println("HELLO");

        /* ? */
        for (int i =0 ; i <=10; i++)
            int x = 0;

        /* ? */
        for (int i = 0; i < 1; System.out.println("WELCOME"))
            System.out.println("hello");

        /* ? */
        do {
            System.out.print(1);
            do {
                System.out.print(2);
            } while (false);
        } while (false);

    }
}
