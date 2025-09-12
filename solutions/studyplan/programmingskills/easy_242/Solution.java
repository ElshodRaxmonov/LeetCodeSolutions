package studyplan.programmingskills.easy_242;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {

    /*  My Solution without any method
     *  Runtime: 1457ms
     *  Memory: 43.23MB
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] oldString = s.toCharArray();
        char[] newString = t.toCharArray();
        int count = 0;
        for (char c : oldString) {
            for (int j = 0; j < newString.length; j++) {
                if (c == newString[j]) {
                    newString[j] = '*';
                    count++;
                    break;
                }
            }
        }
        return count == oldString.length;
    }

    /*  My Solution with sort() method in term of toCharArray()
     *  Runtime: 4ms
     *  Memory: 44.48MB
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);

        Arrays.sort(t1);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }
        return true;
    }

    /*   Solution in Leetcode
     *  Runtime: 4ms
     *  Memory: 45.22MB
     */
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false; //edge case

        // convert string  in character array
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        //sort character lexicographically
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // check if both sorted arrays are identical
        return Arrays.equals(sChars, tChars);
    }
    /*   Solution Chat Gpt
     *  Runtime: 5ms
     *  Memory: 42.28MB
     */
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // only lowercase 'a'–'z'

        // Count chars in s, subtract for t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // If all are 0 → anagram
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }


}
