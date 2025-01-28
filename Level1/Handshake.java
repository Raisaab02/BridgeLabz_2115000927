import java.util.*;
 public class Handshake{
public static void main(String args[])
{
Handshake obj=new Handshake();
int result=obj.CountHandshake();
System.out.println(result);

}
public static int CountHandshake()
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count =(n * (n - 1)) / 2;
return count;
}
}
