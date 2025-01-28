package Level1;
import java.util.Scanner;
public class Triangular {
    public static void main(String[] args) {
        Triangular obj = new Triangular();
        int round=obj.Count();
        System.out.println(round);
    }
    public int Count() {
        double sideside1, sideside2, sideside3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the triangle");
        double size1=sc.nextInt();
        double size2=sc.nextInt();
        double size3=sc.nextInt();
        double perimeter=size1+size2+size3;
        int round=(int) (5000/perimeter);
        return round;

    }
}
