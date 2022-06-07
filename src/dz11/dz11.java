package dz11;

import java.sql.Date.*;

public class dz11 {
    public static void main(String[] args) {
        Animal a1 = new Lev("Lev");
        Animal a2 = new Mechenosec("Mech");
        Animal a3 = new Penguin("Ping");
        Fish f1 = new Mechenosec("Mech2");
        Bird b1 = new Penguin("Ping2");
        Mammal m1 = new Lev("Lev2");
        Mechenosec m2 = new Mechenosec("Mech3");
        Lev l1 = new Lev("Lev3");
        Penguin p1 = new Penguin("Ping3");
        Speakable s1 = new Penguin("Ping4");
        Speakable s2 = new Lev("Lev4");

        Animal[] animal = {a1,a2,a3,f1,b1,m1,m2,l1,p1};
        Speakable[] speakable = {s1,s2,b1,m1,p1,l1};

        for(Animal a : animal){
            if(a instanceof Mechenosec){
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if(a instanceof Penguin){
                Penguin p = (Penguin) a;
                System.out.println(p.name);
                p.speak();
                p.eat();
                p.sleep();
                p.fly();
            } else if ( a instanceof Lev){
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("-----------------------------");
        }

        for(Speakable s : speakable){
            if(s instanceof Penguin){
                Penguin p = (Penguin) s;
                System.out.println(p.name);
                p.speak();
                p.fly();
                p.eat();
                p.sleep();
            } else if(s instanceof Lev){
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.speak();
                l.run();
            }
            System.out.println("------------------------");
        }

    }
}

abstract class Animal{
    Animal(String name){
this.name = name;
    }
    String name;

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;

    }

    void sleep(){
        System.out.println("Vsegda interesno nabludat kak spiat ribi");
    };

    abstract void swim();

}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
     abstract void fly();

    public void speak(){
        System.out.println(name + " sing");
    }

}


abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}


class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba i  bistro plavaet");
    }
    @Override
    void eat() {
        System.out.println("Mechenosec ne hishnaia riba i ona est korm");
    }
}


class Penguin extends Bird{
    Penguin(String name){
        super(name);
        this.name = name;
    }
    @Override
    void fly() {
        System.out.println("Penguin ne ymeet letat");
    }
    @Override
    void eat() {
        System.out.println("Penguin lyubit est");
    }
    @Override
    void sleep() {
        System.out.println("Penguin lyubit spat");
    }
    @Override
    public void speak() {
        super.speak();
        System.out.println("Penguini ne umeyut pet kak solovyi");
    }
}


class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    @Override
    void sleep() {
        System.out.println("Lev luybit spat");
    }
    @Override
    void eat() {
        System.out.println("Lev est miaso");
    }
    @Override
    void run() {
        System.out.println("Lev ne samaya bistraya koshka");
    }
}

interface Speakable{
    default void speak(){
        System.out.println("Something speak");
    }


}