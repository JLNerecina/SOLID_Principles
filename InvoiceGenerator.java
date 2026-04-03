public class InvoiceGenerator implements IInvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}