package Level1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

    }
    public int LargestandSmallest()
    {
        int a, b,c;
        int largest=0 , smallest=0 ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b&&a>c)
        {
            largest=a;

        }
        else if(b>a&&b>c)
            largest=b;
        else if(c>a&&c>b)
            largest=c;
        return largest;
    }
}
