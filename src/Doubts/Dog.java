package Doubts;

public class Dog {
    String name;
    public static void main(String[] args) {
        //make a dog object and access it
        Dog dog1 = new Dog();
        dog1.name = "Bart";

        dog1.bark();

        //now make a dog array
        Dog[] myDogs = new Dog[3];
        //put some dogs in it

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the Dogs using the Array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("My last dog name is  "+ myDogs[2].name);

        //loop through the array and tell all the dogs to bark

        int x  = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x +1;
        }

    }

    public void bark() {
        System.out.println(name +" says Ruff...!!");

    }

    public void eat() {

    }

    public void chaseCat() {

    }
}
