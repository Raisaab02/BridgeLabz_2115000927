import java.util.*;

class height{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
double height=sc.nextDouble();
Double height_in_inch=height/2.54;
double remain_inch= height%2.54;
double infoot=height_in_inch/12;
System.out.println("Your Height in cm is"+height+"while in feet is"+infoot+"and inches is "+ remain_inch);
}
}
