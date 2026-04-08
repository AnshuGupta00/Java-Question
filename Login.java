import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String username, password;
        
        System.out.print("Enter username: ");
        username = sc.nextLine();
        
        System.out.print("Enter password: ");
        password = sc.nextLine();
        
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}