package studyplan.programmingskills.easy_1502;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 5ms
     *  Memory: 44.47MB
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr); // O(n log n)
        int diff = arr[1] - arr[0];
        int n = arr.length;

        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }

}
