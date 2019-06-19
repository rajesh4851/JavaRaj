package Doubts;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[ ] h = new Hobbits[5];
        int z = 0;

        while (z <4) {
            z = z+1;
            h[z] = new Hobbits();
            h[z].name = "Blippi";

            if (z ==1) {
                h[z].name = " zee one";
            }
            else
            {
                h[z].name = "zee else";
            }

            System.out.println(h[z].name + " is a ");
            System.out.println(" good hobbit name");

        }

    }
}
