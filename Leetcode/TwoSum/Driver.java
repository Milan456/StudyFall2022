package Leetcode.TwoSum;
import java.util.Arrays;
import java.util.HashMap;


//The code is trying to find the sum of all numbers in an array

public class Driver {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];                                          //First we create an array with 2 elements
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();    //Than we create our hashmap with two elements
        for (int i = 0; i < numbers.length; i++) {                          //The code iterates through the array
            if (map.containsKey(target - numbers[i])) {             //if the map contains the target subtacted from the element in the array
                result[1] = i;                                      //The second element in the array will be set to i and the first element
                result[0] = map.get(target - numbers[i]);           //will be set to the element from the map
                return result;                                      //Then the result should be the two elements that add up to the target
            }
            map.put(numbers[i], i);                                 //Mapping all of the elements
        }
      
        return result;                                              //If target value not found than return result [0,0]
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
