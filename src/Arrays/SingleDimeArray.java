package Arrays;

public class SingleDimeArray {

    int tomAge = 22;
    int peterAge = 33;
    int samAge = 44;

    double tomHeight = 5.5;
    double peterHeight = 6.6;
    double samHeight = 4.4;

    public static void main(String[] args) {

        SingleDimeArray md = new SingleDimeArray();
        md.printAges();
        md.printHeights();
    }

    void printAges() {
    int ages[] = { tomAge, peterAge, samAge};

    for ( int i=0; i<ages.length; i++) {
        System.out.println("Age of person is :"+ages[i]);
    }
    }

    void printHeights() {
        double heights[] = {tomHeight, peterHeight, samHeight};
        System.out.println("\n");/* print new line*/
        for ( int j = 0; j < heights.length; j++) {
            System.out.println("Height of person is :"+heights[j]);
        }
    }
}
