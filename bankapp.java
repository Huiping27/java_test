import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create bank accounts for two users
        BankAccount account1 = new BankAccount(500.0);
        BankAccount account2 = new BankAccount(1000.0);

        System.out.println("Welcome to the Bank Application!");

        boolean running = true;
        while (running) {
            // Show options to the user
            System.out.println("Please choose an option:");
            System.out.println("1. Display Account Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Set Interest Rate");
            System.out.println("5. Display Interest Rate");
            System.out.println("6. Exit");

            int choice = scanner.nextInt(); // Read the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Which account balance do you want to see? (1 or 2)");
                    int accountChoice = scanner.nextInt();
                    if (accountChoice == 1) {
                        account1.displayBalance();
                    } else if (accountChoice == 2) {
                        account2.displayBalance();
                    }
                    break;

                case 2:
                    System.out.println("Which account do you want to deposit into? (1 or 2)");
                    int depositAccount = scanner.nextInt();
                    System.out.println("Enter the deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    if (depositAccount == 1) {
                        account1.deposit(depositAmount);
                    } else if (depositAccount == 2) {
                        account2.deposit(depositAmount);
                    }
                    break;

                case 3:
                    System.out.println("Which account do you want to withdraw from? (1 or 2)");
                    int withdrawAccount = scanner.nextInt();
                    System.out.println("Enter the withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAccount == 1) {
                        account1.withdraw(withdrawAmount);
                    } else if (withdrawAccount == 2) {
                        account2.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    System.out.println("Enter the new interest rate:");
                    double newRate = scanner.nextDouble();
                    BankAccount.setInterestRate(newRate);
                    break;

                case 5:
                    BankAccount.displayInterestRate();
                    break;

                case 6:
                    System.out.println("Exiting the application...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close(); // Close the scanner
    }
}
