package homeworkweek8;

public class Program12 {
    public static void main(String[] args) {

        int num =17;
        boolean k = false;
        for(int i =2; i<=num / 2; ++i){
            //condition for nonprime number
            if (num % i == 0) {
                k = true;
                break;
            }
        }
        if(!k)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}
