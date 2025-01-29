import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     String  NewS= s.toLowerCase();
        int count = 0,consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>'a'||ch<'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;

                }
                consonant++;
            }


        }
        System.out.println("number of Vowels is"+count);
        System.out.println("number of consonant is"+consonant);

    }
}