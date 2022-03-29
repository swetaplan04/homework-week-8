package homeworkweek8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SumOfEvenDigitSum {
    public static void main(String[] args) {
        System.out.println("should return 20 since 2+4+6+8 =" + getEvenDigitSum(123456789));
        System.out.println("should return 4 since 2+2= " + getEvenDigitSum((252)));
        System.out.println("should return -1 since the number is negative " + getEvenDigitSum(-22));
    }


    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number < 20) {
            firstDigit = number;
            break;

        }
        number /= 10;


    return lastDigit +firstDigit;


}
}


