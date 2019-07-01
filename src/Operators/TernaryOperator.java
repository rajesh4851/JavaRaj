package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 10;
//        boolean result = false;
        String result = "Error";

       result =  (a>b? "a is greater than b" :" b is greater than a");
        System.out.println(result);
    }
}
