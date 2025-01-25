
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double total = 0;

        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            total += heights[i];
        }

        double mean = total / 11;
        System.out.println("Mean height of the football team: " + mean);
    }
}

