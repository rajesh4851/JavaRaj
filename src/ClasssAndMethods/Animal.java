package ClasssAndMethods;

public class Animal {
    String name;
    String gender;
    long age;
    float weight;

    //create  a constructor

    public Animal (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + " eats meat");
    }

    public void sleep() {
        System.out.println(name + " sleeps 2 hours in a day");
    }
}
