package studyplan.programmingskills.easy_1768;

public class Solution {

    /*  My Solution
     *  Runtime: 1ms
     *  Memory : 41.59 mb
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        String longOne;
        String shortOne;
        if (word1.length() >= word2.length()) {
            longOne = word1;
            shortOne = word2;
        } else {
            longOne = word2;
            shortOne = word1;
        }
        for (int i = 0; i < longOne.length(); i++) {

            if (i < shortOne.length()) {
                builder.append(word1.charAt(i));
                builder.append(word2.charAt(i));
            } else {
                builder.append(longOne.charAt(i));
            }
        }
        return builder.toString();
    }

    /*  Other solution
     *  Runtime: 1ms
     *  Memory : 41.72 mb
     */
    public String mergeAlternately1(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }
            i++;
        }
        return builder.toString();
    }

    /* ChatGpt Solution
    *  Runtime: 1ms
    *  Memory : 41.72 mb
    */
    public String mergeAlternately2(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }

}