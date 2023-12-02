import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 12; // Change this to your desired password length
        System.out.println(generatePassword(length));
    }

    public static String generatePassword(int length) {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?";

        String allChars = uppercaseChars + lowercaseChars + digitChars + specialChars;
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
