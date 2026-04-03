public class EmailNotifier implements IEmailNotifier {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}