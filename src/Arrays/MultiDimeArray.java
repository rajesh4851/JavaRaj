package Arrays;

public class MultiDimeArray {

    int tomAge = 22;
    int peterAge = 33;
    int samAge = 44;

    double tomHeight = 5.5;
    double peterHeight = 6.6;
    double samHeight = 4.4;

    public static void main(String[] args) {

        MultiDimeArray md = new MultiDimeArray();
        md.printAges();
    }

    public void printAges() {

    int ages[] = { tomAge, peterAge, samAge};

    for ( int i=0; i<ages.length; i++) {
        System.out.println("Age of person is :"+ages[i]);
    }
    }
}
