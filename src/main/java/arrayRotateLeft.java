import java.util.Arrays;
/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

public class arrayRotateLeft {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = new int[3];
        for (int i = 0; i < 2; i++) {
            result[i]=nums[i+1];
        }
        result[2]=nums[0];

        System.out.println(Arrays.toString(result));
    }
}
