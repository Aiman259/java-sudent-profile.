import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Initialize variable loginAttempts kepada 0
        int loginAttempts = 0;

        // Kita guna loop supaya program boleh tanya berulang kali
        while (loginAttempts <= 3) {
            System.out.println("\n--- Login Page ---");
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            // 2. Logik If-Else untuk had percubaan
            if (loginAttempts < 3) {
                // Tambah 1 pada loginAttempts
                loginAttempts++; 
                System.out.println("Invalid credentials. Try again. (Attempt: " + loginAttempts + "/3)");
            } 
            else if (loginAttempts == 3) {
                System.out.println("Too many login attempts. Please try again later.");
                break; // Hentikan program
            } 
            else {
                System.out.println("Account locked. Please contact support.");
                break; // Hentikan program
            }
        }

        input.close();
    }
}