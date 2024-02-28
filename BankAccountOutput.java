import java.util.Scanner;

public class BankAccountOutput {
    public static void main(String[] args) {
        while (true) {

            System.out.println("\nWhat do you want to do?  \n1.Create account  \n2.Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter name: ");
                String name = input.next();
                System.out.println("Enter Account no: ");
                int accNo = input.nextInt();
                System.out.println("Enter Account type: ");
                String type = input.next();                

                BankAccount acc2 = new BankAccount(name, accNo, type, 1000);
                acc2.display();

                while (true) {

                    System.out.println("\nNow what do you want to do? \n1.Deposit\n2.Withdraw\n3.exit");
                    int cho = input.nextInt();

                    if (cho == 1) {
                        System.out.println("Enter  Amount: ");
                        int y = input.nextInt();
                        acc2.deposit(y);
                        acc2.display();
                    }
                    else if (cho == 2) {
                        System.out.println("Enter Amount: ");
                        int x = input.nextInt();
                        acc2.withdraw(x);
                        acc2.display();
                    }
                    else if (cho == 3) {
                        break;
                    }
                    else
                        System.out.println("Invalid choice");
                }
            }
            else if (choice == 2) {
                break;
            }
            else
                System.out.println("Invalid Choice");
        }
    }
}
