package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        //enter 1 to 5 number get 15 result
        while (count <= 5) {
            System.out.println("Enter number #x: " + count);

            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();
    }

}
