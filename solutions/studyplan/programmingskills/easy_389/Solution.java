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
    /*  My Solution second attempt after learning about ASCII values
     *  Runtime: 3ms
     *  Memory: 41.90
     */
    public char findTheDifference1(String s, String t) {
        int sum_s=0;
        int sum_t=0;
        for(int i=0;i<s.length();i++){
            sum_s+=s.charAt(i);

        }
        for(int i=0;i<t.length();i++){
            sum_t+=t.charAt(i);
        }
        int result = sum_t-sum_s;
        return (char) result;
    }

    /*  Chat Gpt solution
     *  Runtime: 2ms
     *  Memory: 41.92
     */
    public char findTheDifference2(String s, String t) {
        int xor = 0;
        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            xor ^= t.charAt(i);
        }
        return (char) xor;
    }
//    Processing s = abcd
//    xor = 0 ^ 97 ('a')
//            -> result: 97
//    xor = 97 ^ 98 ('b')
//            -> result: 3
//    xor = 3 ^ 99 ('c')
//            -> result: 96
//    xor = 96 ^ 100 ('d')
//            -> result: 4
//
//    Processing t = abcde
//    xor = 4 ^ 97 ('a')
//            -> result: 101
//    xor = 101 ^ 98 ('b')
//            -> result: 7
//    xor = 7 ^ 99 ('c')
//            -> result: 100
//    xor = 100 ^ 100 ('d')
//            -> result: 0
//    xor = 0 ^ 101 ('e')
//            -> result: 101
//
//    Final xor value = 101 (char = 'e')
//
//    Extra character is: e
//    First case: 0 ^ 97
//
//            97 is ASCII for 'a'.
//
//    In binary:
//
//            0   = 00000000
//            97   = 01100001
//            ----------------
//    XOR   = 01100001  (which is 97 in decimal)
//    🔹 Second case: 97 ^ 98
//
//            97 ('a') in binary:
//
//            01100001
//
//
//            98 ('b') in binary:
//
//            01100010
//
//
//    Now XOR each bit column:
//
//            01100001   (97)
//            ^ 01100010   (98)
//            ------------
//            00000011   (3)
//
//
//            👉 That’s why the result is 3 (NOT subtraction, it’s because only the last two bits differ).
//
//            🔹 Why does it "look like subtraction" sometimes?
//
//    It’s coincidence 😅.
//
//    XOR isn’t addition or subtraction.
//
//    It’s just flipping bits:
//
//            1 ^ 1 = 0
//
//            0 ^ 0 = 0
//
//            1 ^ 0 = 1
//
//            0 ^ 1 = 1
//
//    So when numbers are close together (like 97 and 98), their binary differs by a single bit → XOR gives a small number (here 3).
//    But with other pairs, result could be big.
//
//🔹 Visualization (97 vs 98)
//97  = 01100001
//        98  = 01100010
//        ----------------
//    XOR = 00000011  = 3

}
