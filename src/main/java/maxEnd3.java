import java.util.Arrays;

public class maxEnd3 {
    /*
    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value. Return the changed array.
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public static void main(String[] args) {
        int[] nums = {2,11,3};
        int max = nums[0];
        if(nums[2] > nums[0]){
            max = nums[2];
        }
        int[] result = new int[3];
        for (int i = 0; i < result.length; i++) {
            result[i] = max;
        }
        System.out.println(Arrays.toString(result));
    }
}
