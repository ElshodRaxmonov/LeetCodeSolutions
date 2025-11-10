package studyplan.programmingskills.easy_283;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 117ms
     *  Memory: 47.79MB
     */
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 0) {
                count++;
            }
        }

        while (count > 0) {
            for (int x = 1; x < nums.length; x++) {
                if (nums[x - 1] == 0) {
                    int temp = nums[x - 1];
                    nums[x - 1] = nums[x];
                    nums[x] = temp;
                }
            }
            count--;
        }
    }

    /*  ChatGpt Solution
     *  Runtime: 3ms
     *  Memory: 47.82MB
     */
    public static void moveZeroes1(int[] nums) {
        int lastNonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != lastNonZero) {
                    int temp = nums[lastNonZero];
                    nums[lastNonZero] = nums[i];
                    nums[i] = temp;
                }
                lastNonZero++;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
