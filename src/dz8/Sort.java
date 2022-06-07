package dz8;

import java.util.Arrays;

public class Sort {
public static String[] abs(String[] ... s1){
    int lenght = 0;

    for(String[] s2 : s1){
        lenght += s2.length;
    }
    String[] target = new String[lenght];
    int count = 0;
    for(String[] s2 : s1){
        for(String s :s2){
            target[count] = s;
            count++;
        }
    }
    return target;
}

    public static void main(String[] args) {
        String[] target = abs(new String[] {"ok","privet"},new String[]{"aboo","click","muic"});
        for (String s : args){
            for(int i = 0; i< target.length;i++){
                if(s.equals(target[i])){
    target[i] = null;
                }
            }
        }
        for(String s : target){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
