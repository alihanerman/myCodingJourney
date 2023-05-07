import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int option, attempts = 3;
        String username, password;

        // User has 3 attempts to enter correct username and password
        do {
            System.out.println("Enter your username: ");
            username = input.nextLine();
            System.out.println("Enter your password: ");
            password = input.nextLine();

            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password. " + attempts + " attempts left.");
            }
        } while (attempts > 0);

        // If all attempts are used, the user is blocked
        if (attempts == 0) {
            System.out.println("You have exceeded the maximum number of attempts. Your account is blocked.");
            System.exit(0);
        }

        // User menu
        do {
            System.out.println("Welcome to the ATM. Please select an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Your balance is: " + balance + " TL");
                case 2 -> {
                    System.out.print("Enter the amount you want to withdraw: ");
                    int withdrawn = input.nextInt();
                    if (withdrawn > balance) {
                        System.out.println("Insufficient balance! Your balance is: " + balance + " TL");
                    } else {
                        balance -= withdrawn;
                        System.out.println(withdrawn + " TL withdrawn. Your new balance is: " + balance + " TL");
                    }
                }
                case 3 -> {
                    System.out.print("Enter the amount you want to deposit: ");
                    int deposited = input.nextInt();
                    balance += deposited;
                    System.out.println(deposited + " TL deposited. Your new balance is: " + balance + " TL");
                }
                case 4 -> System.out.println("Have a nice day!");
                default -> System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);
    }
}
