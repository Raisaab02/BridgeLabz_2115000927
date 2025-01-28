package Level2;

import java.util.Scanner;

public class FactorsOperations {

    // Method to find and return factors of a number
    public int[] findFactors(int number) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // Store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate the sum of factors
    public int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the sum of squares of factors
    public int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    // Method to calculate the product of factors
    public long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorsOperations fo = new FactorsOperations();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = fo.findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Sum of Factors: " + fo.sumOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + fo.sumOfSquares(factors));
        System.out.println("Product of Factors: " + fo.productOfFactors(factors));
    }
}



