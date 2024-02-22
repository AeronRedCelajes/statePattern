package statePattern;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); //set acct to active state
        myAccount.activate(myAccount); // displays "Account is already activated!"
        System.out.println();
        
        //Suspend the account
        myAccount.suspend(myAccount); //displays "Account is suspended!"
        System.out.println();

        //Activate the account
        myAccount.activate(myAccount); //displays "Account is activated!"
        System.out.println();

        //Deposit to the account
        myAccount.deposit(myAccount, 1000.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().    	                                
        System.out.println();

        //Withdraw to the account
        myAccount.withdraw(myAccount, 100.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().    	                                
        System.out.println();

        //Close the account()
        myAccount.close(myAccount);  //displays "Account is closed!"
        System.out.println();

        //Activate the account
        myAccount.activate(myAccount); // Displays "You cannot activate a closed account!"	
        System.out.println();

        //Suspend the account
        myAccount.suspend(myAccount); // Displays " You cannot suspend a closed account!"
        System.out.println();

        //Withdraw to the account
        myAccount.withdraw(myAccount, 500.0);
        // Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.
        System.out.println();

        //Deposit to the account
        myAccount.deposit(myAccount, 1000.0); 
        // Show message "You cannot deposit on closed //account displays account!". Call the toString() to show current balance and account number.
    }
}
