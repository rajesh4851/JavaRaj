package DataTypes;

public class Example_int {
    public static void main(String[] args) {
        System.out.println("myfirst program");

        int a = 89;
        System.out.println(" value of integer is "+a);

        // a = 0 ; it allows
        // a = -9; it allows
        // a = 7.89; THis is not allowed in java. it will through error
        // Error:(10, 13) java: incompatible types: possible lossy conversion from double to int
        System.out.println(" value of integer is "+a);
    }
}
