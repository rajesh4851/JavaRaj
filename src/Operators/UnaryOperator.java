package Operators;


public class UnaryOperator {
    public static void main(String[] args) {
      int a = 1;
      int b = 0;
      int c = 1;
      int d = 0;

      b =  a++;
      System.out.println("The value of a postfix is : "+ b);  // The value of a postfix is : 1
      d = --c;
      System.out.println("The value of a prefix is : "+ d);  //The value of a prefix is : 0
    }
}
