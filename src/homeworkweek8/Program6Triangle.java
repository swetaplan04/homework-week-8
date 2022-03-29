package homeworkweek8;

public class Program6Triangle {
    public static void main(String[] args) {


        int i, j, number, n = 10;
        //loop for rows
        for (i = 0; i < n; i++) {
            number = 1;
            //loop for columns
            for (j = 0; j <= i; j++) {

                System.out.print(number + " ");
                //incrementing the value of number
                number++;
            }

            System.out.println();
        }
    }
}