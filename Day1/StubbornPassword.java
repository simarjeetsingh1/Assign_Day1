import java.util.Scanner;

public class StubbornPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String secretPassword = "Java123";
        String userInput;

        do {
            System.out.print("Enter the password: ");
            userInput = scanner.nextLine();

            if (!userInput.equals(secretPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }

        } while (!userInput.equals(secretPassword));

        System.out.println("Access Granted");

        scanner.close();
    }
}
