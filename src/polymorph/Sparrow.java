package polymorph;

public class Sparrow extends Bird {

    public Sparrow(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void fly() {

        System.out.println("Bird can fly High");

    }


    public void move() {

        System.out.println("Bird wings are flapping...");

    }


}