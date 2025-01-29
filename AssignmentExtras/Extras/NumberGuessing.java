import java.util.Scanner;
public class NumberGuessing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int randomNumber=1;
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        randomNumber = (int) (Math.random() * range) + min;
        System.out.println("GUESS THE NUMBER BTW 1 to 100");
        int guess = sc.nextInt();


        while (true) {

            if (guess == randomNumber) {
                System.out.println("YOUr NUMBER is right GUESS"+randomNumber+guess);
            } else {
                if (guess < randomNumber) {
                    min = guess;
                } else
                    max = randomNumber+1;
            }
        }
    }
}