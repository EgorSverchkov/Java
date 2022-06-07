public class Math {


    public static int sum (int a, int b,int c,int d){
        int sum = a + b + c + d;
        return sum;
    }

    public static int sum(int a1,int b1,int c1) {
        int sum = a1 + b1 + c1;
        return sum;
    }

    public static int sum(int a2,int b2 ){
        int sum  = a2 + b2;
        return sum;
    }
    public static int sum ( int a3){
        int sum = a3;
        return sum;
    }
    public static int sum(){
        int sum = 0;
        return sum;
    }
}



class MathTest{
    public static void main(String[] args) {
        Math summa = new Math();
        int a = summa.sum();
        System.out.println(a);
    }
}
