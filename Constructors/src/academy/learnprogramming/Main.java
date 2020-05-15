package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.depositFunds(250);
//        bankAccount.withdrawFunds(300);
//        bankAccount.depositFunds(51);
//        bankAccount.withdrawFunds(300);
//        System.out.println(bankAccount.getAccountBalance());
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getCustomerEmail());
//        System.out.println(bankAccount.getCustomerName());
//        System.out.println(bankAccount.getPhoneNumber());
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com",
//                "123-456-7890");
//        System.out.println(timsAccount.getAccountNumber() + " name " +
//                timsAccount.getCustomerName());
        /*
        Challenge time:
        Create a new class VIPCustomer
        It should have 3 fields: name, credit limit, and email address.
        Create 3 constructors.
        The 1st constructor empty should call the constructor with 3 parameters with default values.
        The 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        The 3rd constructor should save all fields.
        Create getters only for this using code generation of IntelliJ as setters won't be needed.
        Test and confirm it works.
         */

        VIPCustomer tigerWoods = new VIPCustomer("Tiger Woods", 500000, "tigerwoods@pgausa.com");
        System.out.println(tigerWoods.getName() + " " + tigerWoods.getCreditLimit() + " " + tigerWoods.getEmail());
        VIPCustomer leBronJames = new VIPCustomer("Lebron James", 1000000);
        System.out.println(leBronJames.getName() + " " + leBronJames.getCreditLimit() +
                " " + leBronJames.getEmail());
        VIPCustomer bruceLee = new VIPCustomer();
        System.out.println(bruceLee.getName() + " " + bruceLee.getCreditLimit()
                + " " + bruceLee.getEmail());
    }
}
