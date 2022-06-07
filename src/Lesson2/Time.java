package Lesson2;

public class Time {



    public static void main(String[] args) {

        int hour = 0;

        while(hour<24) {
            int min = 0;
            do {
                System.out.println(hour + ":" + min);
                min++;
            }while (min < 60);
            hour++;
        }
    }
}

