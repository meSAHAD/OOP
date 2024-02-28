import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marks = new int[50][5]; // Assuming 50 students and 5 subjects
        int[] totalMarks = new int[50];
        int[] highestSubjectMarks = new int[5];
        int[] highestSubjectRollNo = new int[5];
        int highestTotalMarks = 0;
        int studentWithHighestTotalMarks = -1;
        // Reading marks for each student
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                marks[i][j] = scanner.nextInt();
                totalMarks[i] += marks[i][j];
                // Check for highest marks in each subject
                if (marks[i][j] > highestSubjectMarks[j]) {
                    highestSubjectMarks[j] = marks[i][j];
                    highestSubjectRollNo[j] = i + 1;
                }
            }
            // Check for student with highest total marks
            if (totalMarks[i] > highestTotalMarks) {
                highestTotalMarks = totalMarks[i];
                studentWithHighestTotalMarks = i + 1;
            }
        }
        // Display total marks for each student
        for (int i = 0; i < 50; i++) {
            System.out.println("Total marks for student " + (i + 1) + ": " + totalMarks[i]);
        }
        // Display highest marks in each subject and corresponding roll number
        for (int i = 0; i < 5; i++) {
            System.out.println("Highest marks in Subject " + (i + 1) + ": " +
                    highestSubjectMarks[i] +
                    " by student " + highestSubjectRollNo[i]);
        }
        // Display student with the highest total marks
        System.out.println("Student with the highest total marks is: " +
                studentWithHighestTotalMarks +
                " with total marks: " + highestTotalMarks);
        scanner.close();
    }
}