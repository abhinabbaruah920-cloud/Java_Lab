// Interface 1
interface SalesDepartment {
    void processSale(double amount);
}

// Interface 2
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

// Class implementing both interfaces
class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double lastSaleAmount;
    String lastClient;

    // Implement SalesDepartment method
    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Processing Sale...");
        System.out.println("Sale Amount: ₹" + amount);
        System.out.println("Sale processed successfully!");
    }

    // Implement FinanceDepartment method
    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("\nGenerating Invoice...");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: ₹" + amount);
        System.out.println("Invoice generated successfully!");
    }

    void showSummary() {
        System.out.println("\n--- Commercial Summary ---");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: ₹" + lastSaleAmount);
        System.out.println("All operations completed successfully.");
    }
}

// Main class
public class CommercialSystem {
    public static void main(String[] args) {

        CommercialExecutive exec = new CommercialExecutive();

        // Calling methods
        exec.processSale(5000.0);
        exec.generateInvoice("ABC Pvt Ltd", 5000.0);
        exec.showSummary();
    }
}
