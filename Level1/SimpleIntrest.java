package Level1;

import java.util.*;

public class SimpleIntrest{
public static void main(String args[]){
System.out.println("Enter the required details");
Scanner sc= new Scanner (System.in);
double principal=sc.nextDouble();
double rate=sc.nextDouble();
double time=sc.nextDouble();
double SI=SimpleIntrest(principal,rate,time);
System.out.println("Simple Intrest is"+SI);
}
public static Double SimpleIntrest(double p,double r,double t){
double si=(p*r*t)/100;
return si;
}
}
