package dz2;

public class Dz {
    static final double pi = 3.14;


    double square(double rad){
        return pi * rad * rad;
    }

    static double len(double rad){
        return 2 * pi * rad;
    }

    void info(double rad){
        System.out.println("Радиус фигуры: " + rad);
        System.out.println("Площадь фигуры: " + square(rad));
        System.out.println("Длина фигуры: " + len(rad));
    }

    static int multi(int a,int b, int c){
        return a * b * c;
    }

    static void div(int a,int b){
        System.out.println("Целое число: " + a/b);
        System.out.println("Остаток: " + a%b);
    }


}

class DzTest{
    public static void main(String[] args) {
        Dz one = new Dz();
one.info(15);


    }
}
