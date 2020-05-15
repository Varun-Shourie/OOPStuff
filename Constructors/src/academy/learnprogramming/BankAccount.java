package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(1234567800, 0, "vshourie@asu.edu", "Varun Shourie", "6237423737");
        System.out.println("Empty constructor called");
    }
    // general rule in Java is it's better to save values directly to fields rather than calling setter method.
    // this is due to inheritance/sub-classes, so just do it this way for now.
    // don't call setters or other methods other than constructors within those constructors.
    public BankAccount(int number, double balance, String customerEmail, String customerName, String phoneNumber) {
        this.accountNumber = number; // or setAccountNumber(number);
        this.accountBalance = balance; // and vice versa...
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameter called successfully");
    }

    public BankAccount(String customerEmail, String customerName, String phoneNumber) {
        this(9999999, 100.55, customerEmail, customerName, phoneNumber);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositedFunds) {
        this.accountBalance += depositedFunds;
        System.out.println("Your current balance amount after your recent deposit of "
                + depositedFunds + " is " + this.accountBalance);
    }
    public void withdrawFunds(double drawnFunds) {
        if(this.accountBalance >= drawnFunds) {
            this.accountBalance -= drawnFunds;
            System.out.println("Your current balance is " + accountBalance + " after your recent withdrawal" +
                    " of " + drawnFunds);
        } else System.out.println("Could not withdraw funds. Current balance is " + accountBalance);
    }
}
