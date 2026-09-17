import java.util.ArrayList;
import java.util.List;

public class LedgerService {
    private List<Transaction> transactions;
    private FileStorage storage;

    public LedgerService() {
        storage = new FileStorage("data.csv");
        transactions = storage.loadData();
    }

    public void addTransaction(ConsoleValidator validator) {
        System.out.println("1. Income | 2. Expense");
        int typeChoice = validator.getInt("Select type: ");
        String type = (typeChoice == 1) ? "Income" : "Expense";
        
        double amount = validator.getDouble("Enter amount: ");
        String category = validator.getString("Enter category (e.g., Food, Rent, Salary): ");

        Transaction t = new Transaction(type, amount, category);
        transactions.add(t);
        storage.saveData(transactions);
        System.out.println("Transaction saved successfully!");
    }

    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("\n--- Transaction History ---");
        for (Transaction t : transactions) {
            System.out.println(t.toString());
        }
    }

    public void clearData() {
        transactions.clear();
        storage.saveData(transactions);
        System.out.println("All data cleared.");
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
