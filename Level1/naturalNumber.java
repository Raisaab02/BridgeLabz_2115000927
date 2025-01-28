package Level1;

import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args)
    {
        naturalNumber obj =new naturalNumber();
        int sum= obj.CountNatural();
        System.out.println(sum);
}
 public int CountNatural()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     int sum=0;
     for(int i=1;i<=n;i++)
     {
         sum+=n;
     }
     return sum;
}
}
