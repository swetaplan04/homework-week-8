package homeworkweek8;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        System.out.println("Provide single character from the alphabet: ");
        String letter = k.next();

        if(!letter.matches("[A-Za-z]")) {
            System.out.println("Error");
        }else{
            letter = letter.toLowerCase();
            if(letter.matches("[aeiou]")) {
                System.out.println("This is Vowel");
            }else if(letter.length() >1)
            {
                System.out.println("Error");

            }else
            {
                System.out.println("Consonant");
            }
        }

    }
}
