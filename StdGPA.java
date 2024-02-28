

//code by Md. sadekur Rahman Sahad
//submitted to Asif sir
//course code CSE-2107
//Course Title- Object Oriented Programming
//date- 12/6/2023

public class StdGPA{
    private String studenternam; //declare_Name
    private String studenterroll; //declare_Roll
    private int konsemisterer;  //declare_Semester
    private String[] coursecode; //declare_Course_code
    private int[] corcredit;  // declare_credit
    private double[] kotopaise; //declare_Marks
    public StdGPA(String studenternam, String studenterroll, int konsemisterer, String[] coursecode, int[] corcredit, double[] kotopaise) {
        this.studenternam = studenternam;
        this.studenterroll = studenterroll;
        this.konsemisterer = konsemisterer;
        this.coursecode =coursecode;
        this.corcredit=corcredit;
        this.kotopaise = kotopaise;
    }
    public String getName() { //will return student's name
        return studenternam;
    }

    public String getRollNumber() { //will return student's roll number
        return studenterroll;
    }

    public int getkonsemisterer() { //will return the semester the student is in
        return konsemisterer;
    }

    public String[] getcoursecode() { // will return the course code
        return coursecode;
    }

    public int[] getSubjectcorcredit() { // will return the course credit
        return corcredit;
    }

    public double[] getSubjectkotopaise() { // will retunt the marks
        return kotopaise;
    }

}