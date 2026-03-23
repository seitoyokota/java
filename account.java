public class Account {
    private static String storedUsername = "admin";
    private static String storedPassword = "password";
    public static void createAccount(String username, String password) {
        storedUsername = username;
        storedPassword = password;
        System.out.println("Account created successfully.");
    }
    public static boolean loginAccount(String username, String password) {
        if(storedUsername.equals(username) && storedPassword.equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}