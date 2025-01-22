import java.util.*;
 class Avg{
public static void main (String args[]){
 Double maths=0.0, Physics=0.0, Chemistry=0.0;
 Scanner sc = new Scanner(System.in);
 maths = sc.nextDouble();
 Physics = sc.nextDouble();
 Chemistry = sc.nextDouble();
double avg=0.0;
avg=(maths+Physics+Chemistry)/3;
System.out.println("Sam’s average mark in PCM is"+avg);
}
}
