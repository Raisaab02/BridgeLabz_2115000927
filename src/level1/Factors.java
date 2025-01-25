import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = new int[10];
        int index = 0, maxIndex = 10;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxIndex) {
                    maxIndex *= 2;
                    int[] temp = new int[maxIndex];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors of " + num + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

