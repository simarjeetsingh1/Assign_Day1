import java.util.Scanner;

public class GradeCategorizer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Error: Invalid percentage entered. Please enter value between 0 and 100.");
        }
        else if (percentage >= 90) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade: C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
