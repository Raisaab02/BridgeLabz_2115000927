
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][3]; // [physics, chemistry, maths]
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            while (true) {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
                System.out.print("Maths: ");
                marks[i][2] = sc.nextInt();

                if (marks[i][0] >= 0 && marks[i][1] >= 0 && marks[i][2] >= 0) break;
                System.out.println("Invalid marks. Please enter non-negative values.");
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }
        }

        System.out.println("\nStudent Report:");
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}



