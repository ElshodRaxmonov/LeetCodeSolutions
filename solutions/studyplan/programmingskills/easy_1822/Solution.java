package studyplan.programmingskills.easy_1822;

import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 0ms
     *  Memory: 45.26MB
     */
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int n : nums) {
            if (n == 0) return 0;   // any zero means product is zero
            if (n < 0) sign = -sign; // flip sign for each negative
        }

        return sign;
    }

}
