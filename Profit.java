import java.util.*;

class Profit{
public static void main(String args[])
{
    Double percent=0.0,profit=0.0;
Scanner sc =new Scanner(System.in);
Double cp=sc.nextDouble();
Double sp=sc.nextDouble();
if(cp>sp)
{
Double loss=cp-sp;
 percent= loss/cp*100;
}
else
{
 profit=sp-cp;
 percent=profit/cp*100;
}
System.out.println("The Cost Price is INR"+cp+"and Selling Price is INR"+sp);
System.out.println("The Profit is INR"+ profit +"and the Profit Percentage "+ percent);
}

}
