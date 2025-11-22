package studyplan.programmingskills.easy_657;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 4ms
     *  Memory: 46.40MB
     */
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char m : moves.toCharArray()) {
            switch (m) {
                case 'L': x--; break;
                case 'R': x++; break;
                case 'U': y++; break;
                case 'D': y--; break;
            }
        }

        return x == 0 && y == 0;
    }

}
