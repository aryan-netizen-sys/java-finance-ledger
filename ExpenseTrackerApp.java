import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService auth = new AuthService();
        ConsoleValidator validator = new ConsoleValidator(scanner);
        
        System.out.println("=== Personal Finance Ledger ===");
        if (!auth.login(validator)) {
            System.out.println("Authentication failed. Exiting...");
            return;
        }

        LedgerService ledger = new LedgerService();
        AnalyticsService analytics = new AnalyticsService(ledger);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Transaction\n2. View All Transactions\n3. View Summary\n4. Clear Data\n5. Exit");
            int choice = validator.getInt("Select an option: ");

            switch (choice) {
                case 1:
                    ledger.addTransaction(validator);
                    break;
                case 2:
                    ledger.viewTransactions();
                    break;
                case 3:
                    analytics.generateReport();
                    break;
                case 4:
                    ledger.clearData();
                    break;
                case 5:
                    running = false;
                    System.out.println("Saving and exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
