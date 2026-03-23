public class passwords {
    private String website;
    private String username;
    private String password;
    public passwords(String w, String u, String p) {
        website = w;
        username = u;
        password = p;
    }
    public String getWebsite() {
        return website;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String toString() {
        return "Website: " + website + "\nUsername: " + username + "\nPassword: " + password;
    }
}