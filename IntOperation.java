import java.util.*;

class IntOperation{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println(" The results of Int Operations are "+( a + b *c)+","+(a * b + c)+(c + a / b)+" and 1"+(a % b + c));
}
}

