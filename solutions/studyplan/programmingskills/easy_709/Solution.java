package studyplan.programmingskills.easy_709;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 0ms
     *  Memory: 42.77MB
     */
    public String toLowerCase(String s) {


        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32);
            }
        }
        return new String(chars);
    }

    /*  My Solution
     *  Runtime: 0ms
     *  Memory: 42.21MB
     */
    public String toLowerCase1(String s) {

        return s.toLowerCase();
    }
}
