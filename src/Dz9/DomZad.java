package Dz9;

import java.util.*;


public class DomZad {
public ArrayList<String> abc (String ... s){
    ArrayList<String> aL = new ArrayList<>();
    for(String s1 : s){
        if(!aL.contains(s1)){
aL.add(s1);
        }
    }
    Collections.sort(aL);
    System.out.println(aL);
    return aL;
}

    public static void main(String[] args) {
        DomZad dz= new DomZad();
        dz.abc("privet","poka","hello","Davno ne videlis","I am Egor","poka");
    }
}