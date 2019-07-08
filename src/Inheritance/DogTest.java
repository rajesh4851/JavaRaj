package Inheritance;

public class DogTest {

    public String result;
    public void testDog(){
        Dog aDog = new Dog("Jimmy", "German Shepard", 36);
        result = printDogColor();

    }

    public String printDogColor() {
        return " Dog color is black ";
     }

//    public String printDogColor() {
//        return " Dog color is black ";
//    }
}
