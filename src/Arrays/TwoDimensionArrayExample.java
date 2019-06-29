package Arrays;


public class TwoDimensionArrayExample {
    public static void main(String[] args) {
        int fArray[][] = {{52, 35, 364, 78, 356, 65}, {45, 68, 347, 545, 54}};
        int sArray[][] = {{54, 545, 4, 5341, 4, 2, 44}, {45, 252}, {546, 35, 38, 34, 36}};
        String tarray[][] = {{"r1","r2","r3","r4","r5","r6"},{"c1","c2","c3"}};

        TwoDimensionArrayExample td = new TwoDimensionArrayExample();
        td.display(tarray);
        System.out.println("This is First Array");
        td.display(fArray);
        System.out.println("This is a Second Array");
        td.display(sArray);

    }

//    private void display(int x[][]) {
    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "   \t"); // second for loop column *** use print**** not println
            }
            System.out.println(); //first for loop for row
        }
    }

    private void display(String x [][]) {    // method overloading
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");

            }
            System.out.println();
        }

    }
}