package homeworkweek8;

public class Program13 {
    public static void main(String[] args) {
        hasSharedDigit(12,23);
        hasSharedDigit(9,99);
        hasSharedDigit(15,55);
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        while (first > 0) {
            int lastDiget1 = first % 10;
            int lastDiget2 = second % 10;
            int firstDiget1 = first / 10;
            int firstDiget2 = second / 10;
            if ((lastDiget1 == lastDiget2) || (lastDiget1 == firstDiget2) || (firstDiget2 == lastDiget1) || (firstDiget1 == lastDiget2)) {
                return true;
            }
            first /= 10;
            second /= 10;

        }
        return false;
    }
}
