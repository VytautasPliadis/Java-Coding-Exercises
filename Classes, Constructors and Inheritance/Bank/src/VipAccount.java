public class VipAccount {
    private String customerName;
    private double balance;
    private String customerEmail;

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public VipAccount(String customerName, double balance, String customerEmail) {
        this.customerName = customerName;
        this.balance = balance;
        this.customerEmail = customerEmail;
    }

    public VipAccount() {
        this("Vardenis Pavardenis", 1000, "Default email");
        System.out.println("Empty constructor called");
    }

    public VipAccount(String customerName, double balance) {
        this(customerName,balance,"Default email");
    }
}
