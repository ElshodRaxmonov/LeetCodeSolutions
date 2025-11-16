package studyplan.programmingskills.easy_13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 3ms
     *  Memory: 46.21MB
     */
    int eachNumber(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    int romanToInt(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 < roman.length() && eachNumber(roman.charAt(i + 1)) > eachNumber(roman.charAt(i))) {
                result -= eachNumber(roman.charAt(i));
            } else {
                result += eachNumber(roman.charAt(i));

            }
        }
        return result;
    }
    /*  GPT Solution
     *  Runtime: 3ms
     *  Memory: 46.38MB
     */
    int romanToInt2(String s) {
        int[] val = new int[256];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && val[s.charAt(i)] < val[s.charAt(i + 1)])
                result -= val[s.charAt(i)];
            else
                result += val[s.charAt(i)];
        }

        return result;
    }
}
