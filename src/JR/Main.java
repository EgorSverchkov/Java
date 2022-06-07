package JR;

public class Main {
    static class Go{
        public int del(int a){
            return a/5;
        }
    }



    static int x = 25;

    public static int sum(int a){
        return a + a;
    }

    public static void main(String[] args) {
        Main.Go bo = new Main.Go();
        Main m = new Main();
        int bob = bo.del(x);
        int b = m.sum(x);
        System.out.println(bob);
    }
}
