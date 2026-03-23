import java.util.Scanner;
import java.util.ArrayList;
public class passwordKeeper {
    private ArrayList<passwords> passwordList;

    public passwordKeeper() {
        passwordList = new ArrayList<passwords>();
    }
    public void addPassword(String w, String u, String p) {
        passwordList.add(new passwords(w, u, p));
    }
    public static void main(String[] args) {
        passwordKeeper pk = new passwordKeeper();
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Add password\n2. View passwords\n3. Exit\nEnter your choice: ");
        int choice = sc.nextInt();
        while(choice !=3) {
            switch(choice) {
                case 1:
                    System.out.print("Enter website:");
                    String website = sc.next();
                    System.out.print("Enter username:");
                    String username = sc.next();
                    System.out.print("Enter password:");
                    String password = sc.next();
                    pk.addPassword(website, username, password);
                    break;
                case 2:
                    int found=0;
                    System.out.print("Enter website: ");
                    website = sc.next();
                    for(int i = 0; i < pk.passwordList.size(); i++) {
                        if(pk.passwordList.get(i).getWebsite().equals(website)) {
                            System.out.println(pk.passwordList.get(i).toString());
                            found=1;
                        }
                    }
                    if(found==0) {
                        System.out.println("No passwords found for this website.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            } 

            System.out.println("1. Add password\n2. View passwords\n3. Exit");
            choice = sc.nextInt();
        }
    }
}