package statePattern;

public interface AccountState{
    static AccountState activeState(){
        return new ActiveState();
    }

    static AccountState suspendedState(){
        return new SuspendedState();
    }

    static AccountState closedState(){
        return new ClosedState();
    }

    void deposit(Account account, Double amount);
    void withdraw(Account account, Double amount);
    void suspend(Account account);
    void activate(Account account);
    void close(Account account);
}