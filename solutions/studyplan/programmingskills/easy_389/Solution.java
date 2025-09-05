package studyplan.programmingskills.easy_389;

import java.util.Objects;

public class Solution {
    /*  My Solution
     *  But it was not accepted another case which is not understandable
     *  However showed cases were performed
     */
    public char findTheDifference(String s, String t) {
        int i = 0;

        if (Objects.equals(s, "")) {
            return t.charAt(i);
        }
        while (i < s.length()-1 || i < t.length()-1) {
            if (i == t.length()-1) {
                return t.charAt(i);
            } else {
                if (s.charAt(i) != t.charAt(i)) {
                    return t.charAt(i);
                }
            }
            i++;
        }
        return t.charAt(i);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findTheDifference("ert", "ertu"));
    }
}
