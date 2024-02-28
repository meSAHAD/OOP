import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 50;
        int i, j, max, total, n, ni;
        int[] a = new int[SIZE];
        Student[] st = new Student[SIZE];

        System.out.print("Enter how many students: ");
        n = scanner.nextInt();

        // Read names and roll numbers
        for (i = 0; i < n; i++) {
            System.out.print("\nEnter name and roll number for student " + i + ": ");
            String name = scanner.next();
            int rollno = scanner.nextInt();
            st[i] = new Student(name, rollno);
        }

        // Read marks for each student and subject
        for (i = 0; i < n; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("\nEnter marks of student " + i + " for subject " + j + ": ");
                int marks = scanner.nextInt();
                st[i].setSubjectMarks(j, marks);
            }
        }

        // Calculate total marks obtained by each student
        for (i = 0; i < n; i++) {
            total = 0;
            for (j = 0; j < 3; j++) {
                total += st[i].getSubjectMarks(j);
            }
            System.out.println("\nTotal marks obtained by student " + st[i].getName() + " are " + total);
            a[i] = total;
        }

        // List out the student's roll numbers who have secured the highest marks in
        // each subject
        for (j = 0; j < 3; j++) {
            max = 0;
            for (i = 0; i < n; i++) {
                if (max < st[i].getSubjectMarks(j)) {
                    max = st[i].getSubjectMarks(j);
                    ni = i;
                }
            }
            System.out.println("\nStudent " + st[ni].getName() + " got maximum marks = " + max + " in Subject: " + j);
        }

        // Find the student with the total highest marks
        max = 0;
        for (i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                ni = i;
            }
        }
        System.out.println(st[ni].getName() + " obtained the total highest marks.");

        scanner.close();
    }
}

class Student {
    private String name;
    private int rollno;
    private int[] sub;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.sub = new int[3];
    }

    public String getName() {
        return name;
    }

    public void setSubjectMarks(int index, int marks) {
        sub[index] = marks;
    }

    public int getSubjectMarks(int index) {
        return sub[index];
    }
}
