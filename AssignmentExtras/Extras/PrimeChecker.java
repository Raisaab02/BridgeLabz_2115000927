import java.util.*;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean isprime= isPrime(N);
        if (isprime) {
            System.out.println("YES it is a prime number");
        }
        else {
            System.out.println("NO it is NOT a prime number");
        }

    }
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}