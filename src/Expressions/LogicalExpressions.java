package Expressions;

public class LogicalExpressions {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c= !false;

        boolean d = b && !c;
        boolean e = (c || d) || false;
        boolean f = !(b && c) && (true || (c && a));
        boolean g = (a && b) || c && d || (e || f);

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);
        System.out.println("g = "+ g);
    }
}
