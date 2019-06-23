package Random;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string :");
//        String input = scanner.next();
        char[] letters = scanner.nextLine().toCharArray();
        System.out.println(" The reverse of the string is :");
        for ( int i= letters.length-1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
