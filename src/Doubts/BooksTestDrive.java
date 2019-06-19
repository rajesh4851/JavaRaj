package Doubts;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books1 [] myBooks1 = new Books1[3];
        int x = 0;
        myBooks1[0] = new Books1();  //create Books1 objects
        myBooks1[1] = new Books1();
        myBooks1[2] = new Books1();

        myBooks1[0].title = "The Grapes of Java";
        myBooks1[1].title = "The Java gats by";
        myBooks1[2].title = "The Java cook book";
        myBooks1[0].author = "Bob";
        myBooks1[1].author = "Tom";
        myBooks1[2].author = "Jake";

        while (x < 3) {
            System.out.println(myBooks1[x].title);
            System.out.println(" by ");
            System.out.println(myBooks1[x].author);
            x = x + 1;

        }

    }
}
