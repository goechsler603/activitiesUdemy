package entities;

public class BankAccount {

    public String accountName;
    private final int accountNumber;
    private double accountBalance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountName, int accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = initialBalance;
    }

    public void bankDraft (double draft){
        accountBalance = accountBalance - draft - 5;
    }

    public void deposit(double amount){
        accountBalance += amount;
    }

    public String toString() {
        return  "Account:"
                + accountNumber
                + ", Holder:  "
                + accountName
                + ", Account Balance: $ "
                + String.format("%.2f", accountBalance);
    }
}
