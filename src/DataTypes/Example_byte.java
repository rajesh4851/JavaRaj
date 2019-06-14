package DataTypes;

public class Example_byte {
    public static void main(String[] args) {
        byte myDataType;
        // byte data type max = 127 and min = -128
        myDataType = 90;
        System.out.println("value is :"+myDataType);

        myDataType = 127;
        System.out.println("value is :"+myDataType);


        myDataType = -128;
        System.out.println("value is :"+myDataType);


        // myDataType = 190; this is not allowed; throws below error
        //Error:(18, 22) java: incompatible types: possible lossy conversion from int to byte
        System.out.println("value is :"+myDataType);
    }
}
