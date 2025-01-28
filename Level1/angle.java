package Level1;
import java.util.Scanner;

public class angle {
    public static void main(String args[])
    {
        angle obj=new angle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle");
        double Angle=sc.nextDouble();
        double angle[]= obj.calculateTrigonometricFunctions(Angle);

        System.out.println("The angle in sin is "+angle[0]);
        System.out.println("The angle cos is "+angle[1]);
        System.out.println("the angle in tan is"+angle[2]);
    }

    public double[] calculateTrigonometricFunctions(double angles)
    {
        double rad=Math.toRadians(angles);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        double tan=Math.tan(sin/cos);
        return new double []{sin, cos,tan};
    }

}
