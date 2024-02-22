package statePattern;

public class Account {
    String accountNumber;
    Double balance;
    AccountState accountState;

    // Initial state
    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public AccountState getState() {
        return accountState;
    }
    
    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(Double amount) {
        accountState.deposit(this, amount);
    }

    public void withdraw(Double amount) {
        accountState.withdraw(this, amount);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }

    public String toString(){
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance);
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }
}