class Staff {
    private int code;
    private String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublication() {
        return publication;
    }
}

class Typist extends Staff {
    private int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

class RegularTypist extends Typist {
    public RegularTypist(int code, String name, int speed) {
        super(code, name, speed);
    }
}

class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public int getDailyWages() {
        return dailyWages;
    }
}

public class BuStaff {
    public static void main(String[] args) {
        // Create objects jodi mon chay
    }
}
