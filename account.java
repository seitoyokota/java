public class Account {
    private String storedUsername;
    private String storedPassword;
    public Account(String username, String password) {
        storedUsername = username;
        storedPassword = password;
        System.out.println("Account created successfully.");
    }
    public String getUsername() {
        return storedUsername;
    }
    public String getPassword() {
        return storedPassword;
    }
    public String toString() {
        return "Username: " + storedUsername + ", Password: " + storedPassword;
    }
}