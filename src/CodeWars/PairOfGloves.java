package CodeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairOfGloves {

    public static void main(String[] args) {
        System.out.println(numberOfPairs(new String[]{}));
        System.out.println(numberOfPairs(new String[]{"red","red"}));
        System.out.println(numberOfPairs(new String[]{"red", "green", "blue"}));
        System.out.println(numberOfPairs(new String[]{"gray", "black", "purple", "purple", "gray", "black"}));
        System.out.println(numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }


    public static int numberOfPairs(String[] gloves){
        int pairs = 0;
        Map<Integer,Integer> ready = new HashMap<>();

        for(int i = 0 ; i < gloves.length-1 ; i++){
            for(int o = i + 1; o <= gloves.length-1 ; o++){
                if(ready.containsValue(i)|| ready.containsValue(o)){
                    continue;
                }
                if(gloves[i].equals(gloves[o])){
                    ready.put(i,i);
                    ready.put(o,o);
                    pairs++;
                }
            }
        }
        return pairs;
    }

}
