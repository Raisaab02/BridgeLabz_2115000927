package level1;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        int age[]=new int [10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        for(int i=0;i<age.length;i++)
        {
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++)
        {
            if(age[i]>=18)
                System.out.println("Yes,Eligible for level1.voting");
            else
                System.out.println("No,not eligible for level1.voting");
        }
    }
}
