package studyplan.programmingskills.easy_58;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {

    /*  My Solution
     *  Runtime: 4ms
     *  Memory: 42.9MB
     */
    public int lengthOfLastWord(String s) {
        StringBuilder currentWord = new StringBuilder();
        String lastWord = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                currentWord.append(c);
                lastWord = "";

                if (i == s.length() - 1) {
                    return currentWord.length();
                }

                if (s.charAt(i + 1) == ' ') {
                    lastWord = currentWord.toString();
                    currentWord.setLength(0);  // clear
                }
            }
        }

        return lastWord.length();
    }



}
