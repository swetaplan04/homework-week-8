package homeworkweek8;

public class Program15NestedForLoop {

    public static void main(String[] args) {
        printLeftTriangle(5);
    }
    public static void printLeftTriangle(int a){
        for(int i=0; i<a+1; i++){
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    }

