import java.util.Scanner;

public class CenteredPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println(); 
            }
        }

        scanner.close();
    }
}
