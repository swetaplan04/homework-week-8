package homeworkweek8;

public class Program11 {

    public static void main(String[] args) {
        System.out.println("should return 20 since 2 + 4 + 6 + 8 = " + getEvenDigitSum(123456789));
        System.out.println("Should return 4 since 2 + 2 = " + getEvenDigitSum(252));
        System.out.println("should return -1 since the number is negative" + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 0) {

            if (number < 20) {
                firstDigit = number;
                break;
            }
            number /= 10;
        }

        return lastDigit + firstDigit;
    }
}
