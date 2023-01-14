import java.util.Arrays;
/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class ArrayReverseOrder {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] result = new int[7];
        int j = 0;
        for (int i = nums.length-1; i >=0; i--) {
            result[j] = nums[i];
            j++;
        }

        System.out.println(Arrays.toString(result));
    }
}
