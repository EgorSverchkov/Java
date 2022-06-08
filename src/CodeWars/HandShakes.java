package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class HandShakes {
    public static void main(String[] args) {
        System.out.println(pairsHandshakes(0));
        System.out.println(pairsHandshakes(1));
        System.out.println(pairsHandshakes(3));
        System.out.println(pairsHandshakes(6));
        System.out.println(pairsHandshakes(7));
    }


    public static int pairsHandshakes(int handshakes){
        if(handshakes == 0 ){
            return 0;
        }

        int result = 0;
        int summary = 0;

        while(handshakes > summary){
            summary = result * (result + 1)/2;

            result++;
        }
        return result;
    }
}
