package Inheritance;

public class ObjectTest {
    public static void main(String[] args) {
        Dog aDog = new Dog("Jimmy", "German Shepard", 36);
//        Dog sameDog = getObject(aDog);
        Object sameDog = getObject(aDog);
        System.out.println("result is :"+sameDog);
    }

     public static Object getObject(Object o) {
        return o;
    }
}
