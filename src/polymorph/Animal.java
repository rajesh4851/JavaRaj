package polymorph;

public abstract  class Animal {
    int age;
    String gender;
    String  name;

    public Animal(String name, String gender, int age) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void description()
    {
        System.out.println("The name of the Animal is " + name);
        System.out.println("The gender of the Animal is " + gender);
        System.out.println("The age of the Animal is "+age);

    }
    public void eat ()
    {
        System.out.println("Animal eats grass");

    }
    public void sleep()
    {
        System.out.println("Animal sleeps all day");
    }
    public abstract void move();

}

