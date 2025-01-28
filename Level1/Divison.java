package Level1;

import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Divison div = new Divison();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of x and y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double rem = div.remainder(x,y);
        double q = div.quotient(x,y);
        System.out.println("remainder is "+rem);
        System.out.println("quotient is "+q);
    }

    public double remainder(double x, double y) {
        double rem = x % y;

        return rem;

    }

    public double quotient(double x, double y) {
        double quotient = x / y;
        return quotient;
    }
}