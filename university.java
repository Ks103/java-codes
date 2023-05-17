import student.Student;
import student.Course;
import staff.Staff;
import staff.Department;

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1234);
        student.displayInfo();

        Course course = new Course("Computer Science", "CS101");
        course.displayInfo();

        Staff staff = new Staff("Jane Smith", "Professor");
        staff.displayInfo();

        Department department = new Department("Computer Science Department", "CS");
        department.displayInfo();
    }
}
package student;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}
package student;

public class Course {
    private String name;
    private String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
    }
}
package staff;

public class Staff {
    private String name;
    private String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Staff Name: " + name);
        System.out.println("Staff Position: " + position);
    }
}
package staff;

public class Department {
    private String name;
    private String code;

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        System.out.println("Department Code: " + code);
    }
}
