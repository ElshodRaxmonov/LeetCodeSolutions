package studyplan.programmingskills.easy_13

import java.sql.Array

/*  My Solution
   *  Runtime: 5ms
   *  Memory: 46.10MB
   */
fun eachNumber(ch: Char): Int {
    return when (ch) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}

fun romanToInt(s: String): Int {
    var result = 0;
    for (i in 0 until s.length  ) {
        if (i + 1 < s.length && eachNumber(s[i]) < eachNumber(s[i+1])) {
            result -= eachNumber(s[i]);
        } else {
            result += eachNumber(s[i]);
        }
    }
    return result;
}
/*  GPT Solution
   *  Runtime: 4ms
   *  Memory: 46.18MB
   */
fun romanToInt1(s: String): Int {
    val valMap = IntArray(256)
    valMap['I'.code] = 1
    valMap['V'.code] = 5
    valMap['X'.code] = 10
    valMap['L'.code] = 50
    valMap['C'.code] = 100
    valMap['D'.code] = 500
    valMap['M'.code] = 1000

    var result = 0

    for (i in s.indices) {
        if (i + 1 < s.length && valMap[s[i].code] < valMap[s[i + 1].code])
            result -= valMap[s[i].code]
        else
            result += valMap[s[i].code]
    }

    return result
}