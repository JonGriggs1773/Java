

public class BankTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(100.00, 100.00);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingBalance());

        //Testing getter for accounts
        BankAccount.getNumOfAccounts();
        //Testing deposit method for checking account
        System.out.println("Before Deposit");
        BankAccount.getTotalMoney();
        account1.depositToChecking(150.00);
        System.out.println("After Deposit");
        BankAccount.getTotalMoney();
        System.out.println("Checking");
        System.out.println(account1.getCheckingBalance());

        //Testing deposit method for savings account
        // System.out.println("Total Before Deposit");
        // BankAccount.getTotalMoney();
        // account2.depositToSavings(150.00);
        // System.out.println("Total After Deposit");
        // BankAccount.getTotalMoney();
        // System.out.println("Savings-------------------");
        // System.out.println(account2.getSavingBalance());

        //Testing withdrawal method
        // System.out.println("Total Before Withdrawal");
        // BankAccount.getTotalMoney();
        // account2.withdrawalFromChecking(75.00);
        // System.out.println("Total After Withdrawal");
        // BankAccount.getTotalMoney();
        // System.out.println("Savings-------------------");
        // System.out.println(account2.getCheckingBalance());

        // account1.withdrawalFromSavings(100.00);
        // account1.displayAccountInfo();
    }
}