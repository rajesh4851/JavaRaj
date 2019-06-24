package Random;

public class RandomMethod {
    public static void main(String[] args) {
        //print random number  from Math function
        // cast it into double
        System.out.println(Math.random()*5);
        double result = (double)Math.random()*5;
        System.out.println(result);

        //cast into INT
        int resultInt = (int) Math.random()*5;
        System.out.println(resultInt);
    }
}
