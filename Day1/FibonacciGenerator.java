import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            long first = 0;
            long second = 1;

            System.out.println("Fibonacci Sequence:");

            if (n >= 1) {
                System.out.print(first + " ");
            }

            if (n >= 2) {
                System.out.print(second + " ");
            }

            for (int i = 3; i <= n; i++) {
                long next = first + second;
                System.out.print(next + " ");

                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
