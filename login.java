import java.util.Scanner;
public class login {
    ArrayList<Account> accounts = new ArrayList<>();
    public void add(Account account) {
        accounts.add(account);
    }

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
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
                    accounts.add(new Account(user, pass));
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    user = scanner.next();
                    System.out.print("Enter password: ");
                    pass = scanner.next();
                    for(Account account : accounts) {
                        if(account.loginAccount(user, pass)) {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("1. create account\n2. login\n3. exit\nEnter your choice: ");
            choice = scanner.nextInt();
        }
    }
}