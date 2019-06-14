package DataTypes;

public class ExampleShort {
    public static void main(String[] args) {
        short a = 9000;
        /*The short data type is a 16-bit signed two's complement integer. Its value-range
        lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768
        and maximum value is 32,767. Its default value is 0.
        */
        System.out.println("THe value of long variable is :"+a);
        // a = -9.09;  //--> not allowed this, throws below error
        // Error:(11, 14) java: incompatible types: possible lossy conversion from double to short

        // a = 90000;  --> if you assign the value beyond to it's max limit then it will throw error as follows:
//        Error:(14, 13) java: incompatible types: possible lossy conversion from int to short

        a = -9098;
        System.out.println("THe value of long variable is :"+a);
    }
}

