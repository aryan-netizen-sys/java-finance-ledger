public class AuthService {
    private final String PIN = "1234";

    public boolean login(ConsoleValidator validator) {
        int attempts = 3;
        while (attempts > 0) {
            String input = validator.getString("Enter 4-digit PIN to access Ledger: ");
            if (input.equals(PIN)) {
                System.out.println("Access Granted.");
                return true;
            }
            attempts--;
            System.out.println("Incorrect PIN. Attempts remaining: " + attempts);
        }
        return false;
    }
}
