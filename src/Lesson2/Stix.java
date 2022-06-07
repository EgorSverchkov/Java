package Lesson2;

import java.util.Locale;

public class Stix {
    public static void main(String[] args) {
        String stix = "Когда тебя во сне моем не вижу,Мне чудится, что шепчет заклинанья Земля, чтобы исчезнуть под ногами.И за пустое небо уцепиться,Поднявши руки, в ужасе хочу я.В испуге просыпаюсь я и вижу, Как шерсть прядешь ты, низко наклонившись,Со мною рядом неподвижно сидя,Собой являя весь покой творенья.";
             String stixUp = stix.toUpperCase();
             char c1;
             char c2;
             for(int i = 0; i < stix.length();i++){
                 c1 = stix.charAt(i);
                 c2 = stixUp.charAt(i);
                 if(c1 != ',' && c1 != '.' && c1 != ' ' && c1 != ',' && c1 == c2){
                     System.out.println();
                     System.out.print(c1);
                     continue;
                 }
                 System.out.print(c1);
             }
        System.out.println();







    }


}
