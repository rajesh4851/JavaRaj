package DataTypes;

public class ExampleLong {
    public static void main(String[] args) {
        long a = 90009;
        //  long value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive)
        System.out.println("THe value of long variable is :"+a);
        // a = -9.09;  --> not allowed this, throws below error
        // Error:(8, 13) java: incompatible types: possible lossy conversion from double to long

        double b = 9.009;
        System.out.println("THe double value is :"+b);
    }
}

