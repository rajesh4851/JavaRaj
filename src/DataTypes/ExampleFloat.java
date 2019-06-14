package DataTypes;

public class ExampleFloat {
    public static void main(String[] args) {
        float a = 9000.9123f;
        /*The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited.
        It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers.
        The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
        */
        System.out.println("THe value of long variable is :"+a);
        //  a = 9000.98765; --> not allowed this, throws below error
        //  Error:(5, 19) java: incompatible types: possible lossy conversion from double to float

        // a = 90000;  --> if you assign the value beyond to it's max limit then it will throw error as follows:
//        Error:(14, 13) java: incompatible types: possible lossy conversion from int to short

        a = -9098;
        System.out.println("THe value of long variable is :"+a);
    }
}

