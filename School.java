package ArockiaMatha;

import java.util.ArrayList;

public class School {

    public ArrayList<Student> studentList =new ArrayList<>();
    public ArrayList<Teacher> teacherList =new ArrayList<>();
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public void updateStudent(int studentId, Student updatedStudent) {
        for (Student student : studentList) {
            if (student.getId() == studentId) {
                int index = studentList.indexOf(student);
                studentList.set(index, updatedStudent);
                return;
            }
        }
        throw new StudentNotFoundException("Entered student id "+studentId+" is wrong");
    }

    public void deleteStudent(int studentId)  {
        for (Student student : studentList) {
            if (student.getId() == studentId) {
                studentList.remove(student);
                return;
            }
        }
        throw new NotValidIdException("Entered Student id "+studentId+" is not found");
    }

    public Student getStudent(int studentId)  {
        for (Student student : studentList) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        throw new StudentNotFoundException("Entered Student "+studentId+" is  not found");
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }
    public int totalStudents(){
        return studentList.size();
    }
    public  int totalTeachers(){
        return teacherList.size();
    }
    public static void main(String[] args) {
        School ArockiaMatha = new School();
        Address address1=new Address("vaishna nagar","trichy","tamilnadu",123);
        Address address2=new Address("rms nagar","trivandram","kerala",458);
        Address address3=new Address("kno nagar","vadavalli","coimbatore",731);

        Student student1 = new Student(1, "karthik", Grade.second,address1);
        Student student2 = new Student(2, "sankar", Grade.first,address2);
        Student student3 = new Student(5,"benni",Grade.third,address3);

        ArockiaMatha.addStudent(student1);
        ArockiaMatha.addStudent(student2);
        ArockiaMatha.addStudent(student3);

        ArrayList<String> subject=new ArrayList<>();
        subject.add("english");
        subject.add("maths");
        Teacher teacher1 =new Teacher("babu","B.Ed",subject,Grade.first);
        ArockiaMatha.addTeacher(teacher1);

        try {
            Student updatedStudent = new Student(8, "kishore", Grade.fourth,address3);
            ArockiaMatha.updateStudent(1, updatedStudent);

            System.out.println("Searching student");
            Student searchStudent = ArockiaMatha.getStudent(8);
            System.out.println(searchStudent);

            ArockiaMatha.deleteStudent(8);
            System.out.println("Displaying students");
            ArrayList<Student> allStudents = ArockiaMatha.getAllStudents();
            allStudents.forEach(a-> System.out.println(a));
            System.out.println("total number of students = "+ArockiaMatha.totalStudents());
            System.out.println(ArockiaMatha.getTeacherList());
            System.out.println("total number of teachers = "+ArockiaMatha.totalTeachers());

        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());

        }catch (NotValidIdException b) {
            System.out.println(b.getMessage());

        }
    }


}

