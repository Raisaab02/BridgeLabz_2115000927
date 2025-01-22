import java.util.*;

class user_input{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
double fee=0.0,discountP=0.0,discount=0.0;
fee=sc.nextDouble();
discountP =sc.nextDouble();
discount =fee*discountP/100;
System.out.println("The discount amount is INR "+discount+"and final discounted fee is INR "+(fee-discount));
}}

