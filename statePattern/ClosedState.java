package statePattern;

public class ClosedState implements AccountState{

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("You cannot deposit a closed account!");
        account.toString();
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("You cannot withdraw a closed account!");
        account.toString();
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}
