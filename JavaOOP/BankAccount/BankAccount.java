

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;

    BankAccount() {
        accounts++;
    }
    BankAccount(double checkingAmount, double savingAmount) {
        System.out.println("Bank account added and money deposited");
        this.checkingBalance = checkingAmount;
        this.savingsBalance = savingAmount;
        totalMoney += checkingAmount;
        totalMoney += savingAmount;
        accounts++;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingsBalance;
    }

    public static int getNumOfAccounts() {
        System.out.println(BankAccount.accounts);
        return BankAccount.accounts;
    }

    public static double getTotalMoney() {
        System.out.println(BankAccount.totalMoney);
        return BankAccount.totalMoney;
    }

    public void depositToChecking(double deposit) {
        this.checkingBalance += deposit;
        totalMoney += deposit;
    }

    public void depositToSavings(double deposit) {
        this.savingsBalance += deposit;
        totalMoney += deposit;
    }

    public void withdrawalFromChecking(double amount) {
        if(this.checkingBalance - amount < 0) {
            System.out.println("Insufficient Funds :(");
        }
        else {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }
    }

    public void withdrawalFromSavings(double amount) {
        String response = System.console().readLine("Are you sure you would like to withdrawal from your savings account? Answer Y/N");
        System.out.println(response);
        if(response.equalsIgnoreCase("y")) {
            this.savingsBalance -= amount;
            totalMoney -= amount;
        }
        else {
            System.out.println("Great choice, save that money!");
        }
    }

    public void displayAccountInfo() {
        System.out.printf("Checking Balance: %f", this.checkingBalance);
        System.out.printf("Savings Balance: %f", this.savingsBalance);
    }
}