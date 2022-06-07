package Lesson3;

import java.util.Objects;

public class Test1 {


    public static void main(String[] args) {
        Car car_1 = new Car("Red", "V8");
        Car car_2 = new Car("Red", "V8");
        Car car_3 = new Car("Black", "V4");

        System.out.println(car_1.toString());
    }


}



class Car{
    String color;
    String engine;
    Car(String color,String engine){
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }


    public String toString(){
        return "Car have color: " + color + ". And have engine: " + engine;
    }

}
