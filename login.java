import java.util.Scanner;
import java.util.ArrayList;
public class login {
    private ArrayList<Account> accounts;
    public login() {
        accounts = new ArrayList<Account>();
    }
    public void addAccount(String username, String password) {
        accounts.add(new Account(username, password));
    }
    public boolean loginAccount(String username, String password) {
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getUsername().equals(username) && accounts.get(i).getPassword().equals(password)) {
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Login failed. Incorrect username or password.");
        return false;
    }
    public static void main(String[] args) {
        login users = new login();
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. create account\n2. login\n3. exit\nEnter your choice: ");
        int choice = scanner.nextInt();
        while(choice != 3) {
            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String user = scanner.next();
                    System.out.print("Enter password: ");
                    String pass = scanner.next();
                    users.addAccount(user,pass);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    user = scanner.next();
                    System.out.print("Enter password: ");
                    pass = scanner.next();
                    users.loginAccount(user,pass);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("1. create account\n2. login\n3. exit\nEnter your choice: ");
            choice = scanner.nextInt();
        }
    }
}