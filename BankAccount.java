class BankAccount
{
    private String name; 
    private int accnt;
    private String type;
    private int bal;

    BankAccount()   {
        name = "";
        accnt = 0;
        type = "";
        bal = 0;
    }
    BankAccount(String n, int accnumber, String t, int b)   {
        name = n;
        accnt = accnumber;
        type = t;
        bal = b;
    }

    public void deposit(int amt)   {
        bal = bal + amt;
        System.out.println("Deposited Amount : " + amt);
        System.out.println("New Balance " + bal);
    }

    public void withdraw(int amt)    {
        if((bal>amt) && (bal-amt >500))  {
            bal = bal - amt;
            System.out.println(" Withdrawn Amount : " + amt);
            System.out.println("New Balance : " + bal);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public void display()
    {
        System.out.println("\nDetails of account:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accnt);
        System.out.println("Type: " + type);
        System.out.println("Balance : " + bal);
    }
}
