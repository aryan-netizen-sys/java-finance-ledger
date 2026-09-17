import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStorage {
    private String filename;

    public FileStorage(String filename) {
        this.filename = filename;
    }

    public void saveData(List<Transaction> transactions) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Transaction t : transactions) {
                writer.println(t.toCSV());
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public List<Transaction> loadData() {
        List<Transaction> list = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    list.add(new Transaction(parts[0], Double.parseDouble(parts[1]), parts[2]));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading data. Starting fresh.");
        }
        return list;
    }
}
