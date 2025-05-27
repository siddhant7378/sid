import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*[a-z].*") &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[@#$%^&+=!].*")) {

            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
