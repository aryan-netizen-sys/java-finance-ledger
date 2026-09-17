public class Transaction {
    private String type; // "Income" or "Expense"
    private double amount;
    private String category;

    public Transaction(String type, double amount, String category) {
        this.type = type;
        this.amount = amount;
        this.category = category;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }

    public String toCSV() {
        return type + "," + amount + "," + category;
    }

    @Override
    public String toString() {
        return String.format("[%s] $%.2f - %s", type, amount, category);
    }
}
