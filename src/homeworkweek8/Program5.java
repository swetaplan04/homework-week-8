package homeworkweek8;

public class Program5 {

    public static void main(String[] args) {
        System.out.println( isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {

            reverse *= 10;
            int lastDigit = number % 10;
            reverse += lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}