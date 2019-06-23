package Arrays;

public class MultiDimeArray1 {

    int tomAge = 22;  // in years
    int peterAge = 33;
    int samAge = 44;

    int tomWeight = 150;   // in lbs
    int peterWeight = 160;
    int samWeight = 170;

    public static void main(String[] args) {

        MultiDimeArray1 md1 = new MultiDimeArray1();
        md1.printAges();
    }

    public void printAges() {

        int[] ages = {tomAge, peterAge, samAge};
        int[] weights = {tomWeight, peterWeight, samWeight};

        int[][] details = {ages, weights};

        for (int i = 0; i < details.length; i++) {
            for (int j = 0; j < weights.length; j++) {
                if(i/2==0){
                    System.out.println(" Age of the person is :"+details[i][j]);
                }
                else {
                System.out.println("Weight of the person is :" + details[i][j]);

            }
            }

        }
    }
}
