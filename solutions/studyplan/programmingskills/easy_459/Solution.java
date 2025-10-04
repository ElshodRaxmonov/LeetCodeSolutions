package studyplan.programmingskills.easy_459;

import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 125ms
     *  Memory: 45.48MB
     */
    public boolean repeatedSubstringPattern(String s) {
        int repeatedTimes = 0;
        StringBuffer builder = new StringBuffer();
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {

                repeatedTimes = s.length() / s.substring(0, i).length();
                while (repeatedTimes > 0) {
                    builder.append(s.substring(0, i));
                    repeatedTimes--;
                }
                if (builder.toString().equals(s)) return true;
                else builder.delete(0, builder.length());
            }
        }
        return false;
    }

    /*  My Solution second approach
     *  Runtime: 55ms
     *  Memory: 45.25MB
     */
    public boolean repeatedSubstringPattern1(String s) {
        int repeatedTimes = 0;
        StringBuffer builder = new StringBuffer();
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {

                repeatedTimes = s.length() / s.substring(0, i).length();
                while (repeatedTimes > 0) {
                    builder.append(s.substring(0, i));
                    repeatedTimes--;
                }
                if (builder.toString().equals(s)) return true;
                else builder.delete(0, builder.length());
            }
        }
        return false;
    }

    /*  Solutions in LeetCode
     *  Runtime: 8ms
     *  Memory: 45.08MB
     */
    public boolean repeatedSubstringPattern2(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    /*  Solutions in LeetCode
     *  Runtime: 74ms
     *  Memory: 45.27MB
     */
    public boolean repeatedSubstringPattern3(String s) {


        String concatenated = s + s;
        return concatenated.substring(1, concatenated.length() - 1).contains(s);


    }

    /*  Solutions in LeetCode
     *  Runtime: 16ms
     *  Memory: 45.35MB
     */
    public boolean repeatedSubstringPattern4(String s) {


        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;


    }

    /*  Solutions in ChatGpt
     *  Runtime: 74ms
     *  Memory: 45.61MB
     */
    public static boolean repeatedSubstringPattern5(String s) {

        String doubled = s + s;
        // remove the first and last char to avoid trivial match
        return doubled.substring(1, doubled.length() - 1).contains(s);

    }

}
