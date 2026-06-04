public class Main {
    public static void main(String[] args) {
        System.out.println("[DEBUG] Starting CLI tool...");
        try {
            // existing startup logic
        } catch (Exception e) {
            System.err.println("[ERROR] CLI crashed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}