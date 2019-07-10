package exceptions;

import java.util.Scanner;

public class DividedByZeroException {
/* rajes created on 7/10/2019 
inside the package - exceptions */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value here");

        int val = scanner.nextInt();

        int result ;

        try {
            result = 300/val;
        }
        catch (ArithmeticException a) {
            System.out.println("ArithmeticException occured");
            result = 99;
        }
        catch (Exception e) {
            System.out.println("got some error");
            e.printStackTrace();
            result = 1;
        }

        System.out.println("Final result is "+ result);

    }

}
