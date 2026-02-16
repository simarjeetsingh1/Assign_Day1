import java.util.Scanner;

public class VowelConsonantSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        String input = scanner.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabetical character.");
        } else {

            char ch = Character.toLowerCase(input.charAt(0));

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a Vowel.");
                    break;

                default:
                    System.out.println("It is a Consonant.");
            }
        }

        scanner.close();
    }
}
