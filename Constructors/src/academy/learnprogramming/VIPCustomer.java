package academy.learnprogramming;

public class VIPCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer() {
        this("VIP Customer name", 50000, "customer@emailprovider.com");
    }

    public VIPCustomer(String name, int creditLimit) {
        this(name,creditLimit, "customer@emailprovider.com");
    }

    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
