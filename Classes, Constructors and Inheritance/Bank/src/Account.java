public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public Account() {
        this(000000,0.00,"Default name","Default email",0000000000000);
        System.out.println("Empty constructor called");

    }

    public Account(int number, double balance, String customerName, String customerEmail, int customerPhoneNumber) {
//        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " eur. New balance is " + this.balance + " eur.");
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " eur is available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.printf("Withdrawal of " + withdrawalAmount + " eur is successful. Remaining balance is " + this.balance + " eur.");
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
