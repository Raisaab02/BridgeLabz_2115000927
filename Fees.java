import java.util.*;

class Fees{
public static void main (String args[]){
int fee=125000;
double discountP=10;
double discount= discountP/100*fee;
System.out.println("The discount amount is INR"+discount+ "and final discounted fee is INR"+(fee-discount));
}
}
