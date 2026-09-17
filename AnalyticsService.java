public class AnalyticsService {
    private LedgerService ledger;

    public AnalyticsService(LedgerService ledger) {
        this.ledger = ledger;
    }

    public void generateReport() {
        double totalIncome = 0;
        double totalExpense = 0;

        for (Transaction t : ledger.getTransactions()) {
            if (t.getType().equals("Income")) {
                totalIncome += t.getAmount();
            } else {
                totalExpense += t.getAmount();
            }
        }

        System.out.println("\n=== Financial Summary ===");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpense);
        System.out.println("Current Balance: $" + (totalIncome - totalExpense));
        System.out.println("=========================");
    }
}
