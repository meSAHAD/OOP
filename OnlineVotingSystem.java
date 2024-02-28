import java.util.Scanner;

class VoterInformation {
    String roll;
    String name;
    String department;
    VoterInformation next;
}

public class OnlineVotingSystem {
    static VoterInformation head;
    static int count = 0, vote = 0, vote1 = 0, vote2 = 0, vote3 = 0, vote4 = 0, vote5 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mainLogs();
        }
    }

    static void mainLogs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t ****** WELCOME TO THE ONLINE VOTING SYSTEM ****** \n\n");
        System.out.println("Enter one of the choices from below:");
        System.out.println("\t\t1. FOR VOTE ENTRY");
        System.out.println("\t\t2. FOR ADMIN PANEL\n");
        System.out.println("NB: IF YOUR INFORMATION MATCHES WITH THOSE IN THE VOTER LIST THEN ONLY YOU CAN GIVE YOUR VOTE, OTHERWISE YOU CAN'T\n");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);
        if (choice == '1') {
            voterInsert();
        } else if (choice == '2') {
            admin();
        } else {
            mainLogs();
        }
    }

    static void voterInsert() {
        Scanner scanner = new Scanner(System.in);
        VoterInformation temp = new VoterInformation();
        System.out.println("\n\n\t IF ROLL, YOUR NAME AND YOUR DEPARTMENT MATCHES THEN YOU CAN GIVE YOUR VOTE OTHERWISE NOT\n\n");
        System.out.print("\t\tNow Please \n");
        System.out.print("\t\t\tEnter your ROLL number: ");
        scanner.nextLine(); // Consume newline left-over
        temp.roll = scanner.nextLine();
        System.out.print("\t\t\tEnter Your NAME: ");
        temp.name = scanner.nextLine();
        System.out.print("\t\t\tEnter Your Department: ");
        temp.department = scanner.nextLine();
        temp.next = null;

        head = temp;
        while (temp != null) {
            // Check for matching voter information
            if ((temp.roll.equals("21CSE026") && temp.name.equals("Md. Sadekur Rahman Sahad") && temp.department.equals("CSE")) 
                    // Other conditions...
            ) {
                // Process voting
                search(temp.roll, temp.name, temp.department);
                if (count == 0) {
                    voting();
                } else {
                    System.out.println("\n\nYOU HAVE ALREADY GIVEN YOUR VOTE & CAN'T VOTE AGAIN\n");
                    mainLogs();
                }
            } else {
                System.out.println("\n\n\n\n\tYour ROLL or NAME or DEPARTMENT is wrong\n\n");
                System.out.println("\tPlz Re-Enter\n\n");
                mainLogs();
            }
            temp = temp.next;
        }
    }

    static void search(String roll, String name, String department) {
        count = 0;
        VoterInformation t, space;
        if (head == null) {
            space = new VoterInformation();
            space.roll = roll;
            space.name = name;
            space.department = department;
            head = space;
            space.next = null;
        } else {
            t = head;
            while (t != null) {
                if (t.roll.equals(roll) && t.name.equals(name) && t.department.equals(department)) {
                    count = 1;
                    break;
                }
                t = t.next;
            }
            if (count == 0) {
                space = new VoterInformation();
                space.roll = roll;
                space.name = name;
                space.department = department;
                t = space;
                space.next = null;
            }
        }
    }

    static void voting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t  * * * * * * LIST OF CANDIDATES * * * * * \n\n");
        System.out.println("\t\t\t NAME                             SYMBOL\n\n");
        System.out.println("\t\t\t 1.Nizam Uddin                    1.Kite");
        System.out.println("\t\t\t 2.Kalidas Boral                  2.Boat");
        System.out.println("\t\t\t 3.Md. Shamim Sheikh              3.Football");
        System.out.println("\t\t\t 4.Moushumi Akter                 4.Cup");
        System.out.println("\t\t\t 5.Mohon Ali Biswas               5.Pineapple\n\n\n");
        System.out.print("\t\t\t Enter Your Candidate's no : ");
        int B = scanner.nextInt();
        // Process voting options based on input B
        // Update respective vote counts
        switch (B) {
            case 1:
                vote1++;
                System.out.println("\n\nYOU HAVE SUCCESSFULLY GIVEN YOUR VOTE TO Nizam Uddin\n");
                break;
            case 2:
                vote2++;
                System.out.println("\n\nYOU HAVE SUCCESSFULLY GIVEN YOUR VOTE TO Kalidas Boral\n");
                break;
            // Other cases for different candidates...
            default:
                System.out.println("\n\tINVALID CHOICE ENTERED\n\n\tENTER AGAIN\n");
        }
        System.out.println("\nTHANK YOU\n\nPress any key to finish voting");
        scanner.nextLine(); // Consume newline left-over
        scanner.nextLine(); // Wait for user input to finish
    }

    static void admin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Password To Unlock The Admin Panel: ");
        int B = scanner.nextInt();
        if (B == 4321) {
            show();
        } else {
            System.out.println("Wrong Password\n");
        }
    }

    static void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("\t\t\tPresent Vote Count :\n\n");
        System.out.println("\t\t\t  Nizam Uddin  is on        " + vote1 + " Votes");
        System.out.println("\t\t\t  Kalidas Boral   is on     " + vote2 + " Votes");
        System.out.println("\t\t\t  Md. Shamim Sheikh is on   " + vote3 + " Votes");
        System.out.println("\t\t\t  Moushumi Akter  is on     " + vote4 + " Votes");
        System.out.println("\t\t\t  Mohon Ali Biswas  is on   " + vote5 + " Votes\n\n\n\n");
        System.out.print("Enter Any Key For Main Menu\n\n OR \n\nENTER THE SPECIAL PASSWORD TO CLOSING VOTING PORTAL: ");
        int G = scanner.nextInt();
        if (G == 1234) {
            System.out.println("\n\n\t\t\t * * * The VOTING is now CLOSED * * *  \n\n\n");
            System.exit(0);
        } else {
            mainLogs();
        }
    }
}
