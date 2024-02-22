package statePattern;

public class ActiveState implements AccountState{

    @Override
    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited: " + amount + " Current Balance: " + account.getBalance());
        account.toString();
    }

    @Override
    public void withdraw(Account account, Double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdraw: " + amount + " Current Balance: " + account.getBalance());
        account.toString();
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}