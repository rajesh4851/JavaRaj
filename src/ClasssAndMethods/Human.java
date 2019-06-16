package ClasssAndMethods;

public class Human {
    String name;
    int age;
    int height;
    String eyeColor;

    // write a constructor method - it's same name as the class name always
    public Human() {

    }

    //This is a method which will provide the human behaviour - speaking
    public void speak(){
        System.out.println("My name is :"+name);
        System.out.println(name+" age is :"+age);
        System.out.println(name+" height is :"+height);
        System.out.println(name+" eye color is :"+eyeColor);
    }

    public void eat () {
        System.out.println(name + " eats chicken");
    }

    public void walk () {
        System.out.println(name + " walks a mile every day");
    }

    public void work () {
        System.out.println(name + " works in google inc, california");
    }

}
