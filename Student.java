package ArockiaMatha;

public class Student {
    private int id;
    private String name;
    private Grade grade;
    private Address address;
    Student(){

    }
    Student(int id, String name, Grade grade,Address address) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address=address;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Grade getGrade() {
        return grade;
    }
    Address getAddress(){
        return address;
    }

    public String toString() {
        return "Student in "+ grade+"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", address=" + address +
                '}';
    }
}
