
class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using `this`
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Instanceof check before displaying student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Grade: " + grade +
                    ", University: " + universityName);
        }
    }
}




