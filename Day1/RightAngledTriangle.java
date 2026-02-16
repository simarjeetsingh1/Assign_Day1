import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            for (int i = 1; i <= rows; i++) {    

                for (int j = 1; j <= i; j++) {   
                    System.out.print("*");
                }

                System.out.println();           
            }
        }

        scanner.close();
    }
}
