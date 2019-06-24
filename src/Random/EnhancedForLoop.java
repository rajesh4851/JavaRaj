package Random;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] evenNumbers = {2,4,6};
        // regular for loop
        for ( int i =0; i<evenNumbers.length; i++){
            System.out.println(evenNumbers[i]);
        }

        // enhanced for loop
        System.out.println("\n");
        for (int j : evenNumbers) {
            System.out.println(j);  //shouldn't refer like this evenNumbers[j]
        }
    }
}
