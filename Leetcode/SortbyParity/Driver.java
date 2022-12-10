package Leetcode.SortbyParity;

import java.util.Arrays;

public class Driver {

 //                     i is odd          i is even   
 //   j is odd            j++             i++, j++
 //   j is even     swap, i++, j++        i++, j++


    public static int[] sortArrayByParity(int[] nums) {
        int i=0, j;
        for(j=1; j<nums.length; j++){
            if(nums[i] % 2 == 0) i++;
            else {
                if(nums[j] % 2 == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        }
        return nums;
    }
    

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
