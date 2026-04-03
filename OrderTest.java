public class OrderTest {
    public static void main(String[] args) {
        
        IOrderCalculator calculator = new OrderCalculator();
        calculator.calculateTotal(10.0, 2);

        IOrderPlacer placer = new OrderPlacer();
        placer.placeOrder("John Doe", "123 Main St");

        IInvoiceGenerator invoiceGen = new InvoiceGenerator();
        invoiceGen.generateInvoice("order_123.pdf");

        IEmailNotifier notifier = new EmailNotifier();
        notifier.sendEmailNotification("johndoe@example.com");
    }
}