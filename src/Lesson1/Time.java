package Lesson1;

public class Time {
    public void time(){
        for (int hour = 23; hour <= 23; hour++){
            for (int min = 30; min <= 59; min++){
                for (int sec = 0; sec <= 59; sec++){
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }
}

class TimeTest{
    public static void main(String[] args) {
        Time t = new Time();
        t.time();
    }
}