package dz4;

import javax.print.DocFlavor;

public class Car {
    String color;
    String engine;
    public int doors;

    Car(String color,String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }




}

class CarTest{
    void changeDoors(Car c,int doorCount){
        c.doors = doorCount;
    }

    void changeColor(Car c1,Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;

    }


    public static void main(String[] args) {
       CarTest carTest = new CarTest();
        Car car1 = new Car("black","V8",2);
        Car car2 = new Car("white", "V6",4);
        System.out.println(car1.color + " " + car1.doors);
        System.out.println(car2.color);
        System.out.println();
        carTest.changeDoors(car1,4);
        carTest.changeColor(car1,car2);
        System.out.println(car1.color + " " + car1.doors);
        System.out.println(car2.color);



    }
}
