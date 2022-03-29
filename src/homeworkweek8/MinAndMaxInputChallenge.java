package homeworkweek8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MinAndMaxInputChallenge mmi = new MinAndMaxInputChallenge();
        mmi.minMax();
    }

    public void minMax() {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;
        while (true) {

            System.out.println("Enter number:");
            boolean b = sc.hasNextInt();
            if (b) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                break;
            }


        }
    }
}
