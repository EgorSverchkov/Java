package Collections;

public class B extends A{

    public B() throws Exception {
        throw new Exception("say Hi");
    }


    public static void main(String[] args) {
        try{
            B b = new B();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
