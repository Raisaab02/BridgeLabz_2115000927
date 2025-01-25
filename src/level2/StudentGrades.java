
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            while (true) {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();

                if (physics[i] >= 0 && chemistry[i] >= 0 && maths[i] >= 0) break;
                System.out.println("Invalid marks. Please enter non-negative values.");
            }

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}



