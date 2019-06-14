package DataTypes;

public class ExampleDouble {
    public static void main(String[] args) {
        /*
        The double data type is a double-precision 64-bit IEEE 754 floating point.
        Its value range is unlimited. The double data type is generally used for decimal
        values just like float. The double data type also should never be used for precise values,
        such as currency. Its default value is 0.0d.
         */

        double b = 9.009;
        System.out.println("THe double value is :"+b);

        b = +989;
        System.out.println(b);

        b = -989;
        System.out.println(b);

        /* output is as follows
        THe double value is :9.009
        989.0
        -989.0

         */
    }
}

