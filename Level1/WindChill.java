package Level1;

import java.util.Scanner;

public class WindChill {
    public static void main(String args[])
    {
        WindChill obj= new WindChill();

double windChill= obj.WindTemp();
System.out.println(windChill);
    }
    public double WindTemp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the wind temperature in degrees");
        double windTemp = sc.nextDouble();
        System.out.println("Enter the wind speed in degrees");
        double windSpeed = sc.nextDouble();
        double windChill=35.74+0.6215*windTemp+(0.4275*windTemp-35.75)*Math.pow(windSpeed,0.16);
        return windChill;
    }
}
