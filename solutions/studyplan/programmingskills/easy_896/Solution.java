package studyplan.programmingskills.easy_896;

import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 2ms
     *  Memory: 85.28MB
     */
    public boolean isMonotonic(int[] nums) {

        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] > nums[i - 1]) inc = false;
            if (nums[i] < nums[i + 1]) dec = false;
        }
        return inc || dec;
    }

}
