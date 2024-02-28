import java.util.Scanner;

public class Result {
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 50;
        Scanner in = new Scanner(System.in);

        int rollNo[] = new int[TOTAL_STUDENTS];
        int sA[] = new int[TOTAL_STUDENTS];
        int sB[] = new int[TOTAL_STUDENTS];
        int sC[] = new int[TOTAL_STUDENTS];
        double total[] = new double[TOTAL_STUDENTS];

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Enter student " + (i + 1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            sA[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            sB[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            sC[i] = in.nextInt();
            total[i] = (sA[i] + sB[i] + sC[i]);
        }

        System.out.println("\nRoll No\tTotal Marks");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println(rollNo[i] + "\t" + total[i]);
        }


        System.out.println("\nStudents with highest total mark:");
        double highestmark = 0;
        double roll=0;
        for (int i = 0; i < 3; i++) {
            if (highestmark<total[i]){
                highestmark = total[i];
                roll= i;
            }
            
        }
        System.out.println(roll + "\t" + highestmark);
    }
}