import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our chatbot!");
        System.out.println("Type 'i want to log in' to begin.");

        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.contains("i want to log in")) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Store email and password in the database (you'll need to implement this part)
            // For simplicity, let's assume we store them in memory:
            // Map<String, String> userDatabase = new HashMap<>();
            // userDatabase.put(email, password);

            System.out.println("Your account has been registered.");
        } else {
            System.out.println("I'm sorry, I didn't understand that.");
        }

        scanner.close();
    }
}