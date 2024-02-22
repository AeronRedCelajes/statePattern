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

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(Account account, Double amount) {
        accountState.deposit(account, amount);
    }

    public void withdraw(Account account, Double amount) {
        accountState.withdraw(account, amount);
    }

    public void suspend(Account account) {
        accountState.suspend(account);
    }

    public void activate(Account account) {
        accountState.activate(account);
    }

    public void close(Account account) {
        accountState.close(account);
    }

    public String toString(){
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance);
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }
}
