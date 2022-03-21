import java.util.Scanner;

public class password_validation {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        boolean validate = false;
        while (validate!=true){
            System.out.println("Enter Password with following requirements\n"+"At least one uppercase alphabet\n"+"At least one lowercase alphabet\n"+"At least one special characters\n"+"At least one number");
            password = sc.next();
            validate = testPass(password);
        }
    }
    public static boolean testPass(String password){
        try {
            if (password.length() <= 5 || password.length() >= 10) {
                    throw new Exception("Password should be between 5-10 characters");
            }
            int count = 0;

            for (int i=0; i<password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    break;
                }
                count++;
            }
            if (count==password.length()) {
                throw new Exception("Invalid, need an uppercase letter");

            }
            count = 0;

            for (int i=0; i<password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    break;
                }
                count++;
            }
            if (count==password.length()) {
                throw new Exception("Invalid, need a lowercase letter");

            }
            count = 0;

            char[] specialChar = {'!', '@', '#', '$', '&', '*', ':', ';'};

            check:
            for (int i=0; i<password.length(); i++) {
                for (int j=0; j<password.length(); j++) {
                    if (password.charAt(i) == specialChar[j]) {
                        break check;
                    }
                }
                count++;
            }
            if (count==password.length()) {
                throw new Exception("Invalid, need a special character");

            }

            for (int i=0; i<password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    break;
                }
                count++;
            }
            if (count == password.length()) {
                throw new Exception("Invalid, need a number");

            }
            count = 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Password set");
        return true;
    }
}
