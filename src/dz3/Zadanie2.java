package dz3;

public class Zadanie2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(a);

    }

    public static void main(String[] args) {
        Zadanie2 z = new Zadanie2();
        z.abc(5);
    }
}
