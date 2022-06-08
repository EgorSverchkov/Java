package CodeWars;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
int[] nums = new int[]{1,2,3};
        System.out.println(Arrays.toString(twoSum(nums, 4)));
    }





    public static int[] twoSum(int[] numbers, int target){
        int[] sol = new int[2];
        int num = 0;
        for(int i = 0; i < numbers.length-1 ; i++){
            for(int o = i+1; o <= numbers.length-1; o++){
                if(num == 1){
                    return sol;
                }
                if(numbers[i] + numbers[o] == target){
                    sol[0] = i;
                    sol[1] = o;
                    num++;
                }
            }
        }
        return null;
    }
}
