import java.util.regex.*;

public class PasswordValidator {

    public static boolean isValid(String password) {

        String regex =
                "^(?=.*[A-Z])" +      
                "(?=.*[a-z])" +       
                "(?=.*\\d)" +       
                "(?=.*[@#$%&])" +    
                ".{8,}$";          

        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {
        System.out.println(isValid("Abc@1234")); // true
    }
}
