import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {

            long factorial = 1;  
            int i = number;

            while (i > 0) {
                factorial *= i; 
                i--;        
            }

            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
