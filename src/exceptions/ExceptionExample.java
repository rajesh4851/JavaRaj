package exceptions;

import java.util.Scanner;

public class ExceptionExample {
    /* rajes created on 7/9/2019 */


    public static void main(String[] args) {

        try {
            myMethod();
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException occured");
            a.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("got some error");
            e.printStackTrace();
        }
    }


    static void myMethod() {
        int a = 100;
        int b = 1;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value");
        b = scanner.nextInt();
        result = a / b;
        System.out.println("value of result is :" + result);
    }

}
