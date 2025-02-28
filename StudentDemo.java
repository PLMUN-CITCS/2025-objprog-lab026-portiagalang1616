// Define the Student class
class Student {
    // Private attributes
    private String name;
    private int id;
    private double gpa;

    // Static variable to keep track of student count
    private static int studentCount = 0;

    // Constructor
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display total student count
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);
        
        // Display student details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        
        // Display total student count
        Student.displayStudentCount();
    }
}
