import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int persons = sc.nextInt();

        double[][] personData = new double[persons][3]; // [weight, height, BMI]
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            while (true) {
                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                System.out.print("Height (m): ");
                personData[i][1] = sc.nextDouble();

                if (personData[i][0] > 0 && personData[i][1] > 0) break;
                System.out.println("Invalid input. Please enter positive values.");
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine Weight Status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < persons; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f m, BMI = %.2f, Status = %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}

