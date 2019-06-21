package Doubts;

public class Xcopy {
    public static void main(String[] args) {
        int org = 42;
        Xcopy x = new Xcopy();
        int y = x.go(org);

        System.out.println(org+ " " +y );
    }
    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
