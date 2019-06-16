package ClasssAndMethods;

public class Earth {
    public static void main(String[] args) {
        Human tom;
        tom = new Human();  // create a new object using the constructor method
        tom.speak();
        /* The above statement gives the output as follows:
        * My name is :null
            null age is :0
            null height is :0
            null eye color is :null
         */

        tom.name = "Tom";
        tom.age = 32;
        tom.height = 6;
        tom.eyeColor = "Black";
        /* The above statement output is :
        My name is :Tom
        Tom age is :32
        Tom height is :6
        Tom eye color is :Black
        */

        tom.speak();

    }
}
