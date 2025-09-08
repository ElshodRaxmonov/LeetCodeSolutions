package studyplan.programmingskills.easy_28;

import java.util.Objects;

public class Solution {

    /*  My Solution second way attempt after using substring
     *  Runtime: 0ms
     *  Memory: 41.86
     */
    public static int strStrSubstring(String haystack, String needle) {
        int start = -1;
        int until = needle.length();
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && start == -1) {
                start = i;

                if (start + until <= haystack.length() &&
                        haystack.substring(start, start + until).equals(needle)) {
                    return i;
                } else {
                    start = -1;
                }
            }

        }
        return start;
    }
    /*  Solution with Java indexOf() function
     *  Runtime: 0ms
     *  Memory: 41.53
     */
    public static int strStrSubstring2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    /*  Solutions of others
     *  Runtime: 0ms
     *  Memory: 41.99
     */
    public static int strStrSubstring3(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }




}
