package DataTypes;

public class ExampleBoolean {
    public static void main(String[] args) {
        boolean a = true;
        /*The Boolean data type is used to store only two possible values: true and false. This data type is used for
        simple flags that track true/false conditions. The Boolean data type specifies one bit of information,
        but its "size" can't be defined precisely.*/
        System.out.println("THe value of long variable is :"+a);

        a = false;
        System.out.println("THe value of long variable is :"+a);

//        a = 'a';  --> not allowed, throws below error
//        Error:(14, 13) java: incompatible types: char cannot be converted to boolean

        a = 2==2;
        System.out.println("THe value of long variable is :"+a);

    }
}

