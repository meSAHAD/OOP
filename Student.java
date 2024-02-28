class Student {
    //private String name;
    private int rollno;
    private int[] sub;

    public Student(int rollno) {
        //this.name = name;
        this.rollno = rollno;
        this.sub = new int[3];
    }

    public void setSubjectMarks(int index, int marks) {
        sub[index] = marks;
    }

    public int getSubjectMarks(int index) {
        return sub[index];
    }
}
