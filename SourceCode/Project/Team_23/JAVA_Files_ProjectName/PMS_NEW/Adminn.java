public class Adminn {
    private int id;
    private String name;
    private String email;

    // Constructor
    public Adminn(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to log in
    public void login() {
        System.out.println(name + " logged in as Admin.");
    }

    // Method to view audit logs
    public void viewAuditLogs() {
        System.out.println("Viewing audit logs...");
        // Implement your logic here
    }

    // Method to log out
    public void logout() {
        System.out.println(name + " logged out.");
    }
}
