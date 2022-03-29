package homeworkweek8;

public class Program7 {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int firstDigit = number % 10;
        int lastDigit = 0;
        for (int i = number; i != 0; ) {
            lastDigit = i % 10;
            i = i / 10;
        }
        return (firstDigit + lastDigit);
    }
}
