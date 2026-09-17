import java.util.Scanner;

public class ConsoleValidator {
    private Scanner scanner;

    public ConsoleValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
            }
        }
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
