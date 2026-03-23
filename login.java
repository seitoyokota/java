import java.util.Scanner;
public class login {
    private static String storedUsername = "admin";
    private static String storedPassword = "password";
    public static void createAccount(String username, String password) {
        storedUsername = username;
        storedPassword = password;
        System.out.println("Account created successfully.");
    }
    public static void loginAccount(String username, String password) {
        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. create account\n2. login\nEnter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter username: ");
                String user = scanner.next();
                System.out.print("Enter password: ");
                String pass = scanner.next();
                createAccount(user, pass);
                break;
            case 2:
                System.out.print("Enter username: ");
                user = scanner.next();
                System.out.print("Enter password: ");
                pass = scanner.next();
                loginAccount(user, pass);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}