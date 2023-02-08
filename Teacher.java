package ArockiaMatha;

import java.util.ArrayList;

public class Teacher {
    String name;
    String qualification;
    ArrayList subject;

    Grade teachingGrade;

    public Teacher(String name, String qualification, ArrayList subject,Grade teachingGrade) {
        this.name = name;
        this.qualification = qualification;
        this.subject = subject;
        this.teachingGrade=teachingGrade;
    }

    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", qualification='" + qualification + '\'' + ", subject='" + subject + '\'' + ", Teacher Grade= " +teachingGrade+'}';
    }
}
