public class Account {
    private String customerName;
    private int accountNumber;
    private String accountType;
    protected double balance; 

    public Account(String customerName, int accountNumber, String accountType) {
        customerName = customerName;
        accountNumber = accountNumber;
        accountType = accountType;
        balance = 1000;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
    public void computeInterest()
    public void withdraw(double withdrawalAmount)
}

public class CurrentAccount extends Account {
    public CurrentAccount(String customerName, int accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }
    @Override
    public void withdraw(double withdrawalAmount) {
    }
}

public class SavingsAccount extends Account {
    public SavingsAccount(String customerName, int accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }
    @Override
    public void computeInterest() {
       balance = balance + balance * 0.05;
    }
    @Override
    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount>0 && withdrawalAmount<=balance){
            balance= balance-withdrawalAmount;
        }
    }
}
