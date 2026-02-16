import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a multi-digit integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not considered palindrome.");
        } else {

            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {

                int digit = number % 10;        
                reversedNumber = reversedNumber * 10 + digit;
                number = number / 10;          
            }

            System.out.println("Reversed Number: " + reversedNumber);

            if (originalNumber == reversedNumber) {
                System.out.println("It is a Palindrome ");
            } else {
                System.out.println("It is NOT a Palindrome ");
            }
        }

        scanner.close();
    }
}
