package CodeWars;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Kata kata = new Kata();
        int[] n = new int[]{2, 11, 7 ,15};
        System.out.println((Arrays.toString(kata.twoSum(n, 9))));

    }
}

class Kata {
    public static int[] twoSum(int[] nums, int number) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] == number) {
                result[0] = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(nums[i]);
                result[1] = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(nums[i + 1]);
                continue;
            }
        }
        return result;
    }
}




