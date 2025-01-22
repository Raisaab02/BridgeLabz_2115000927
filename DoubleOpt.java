import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double quotient = x / y;
        double remainder = x % y;
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + " of two numbers " + x + " and " + y + ".");
    }
}

