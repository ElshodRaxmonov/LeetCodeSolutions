package studyplan.programmingskills.easy_709

import java.sql.Array

/*  My Solution
   *  Runtime: 0ms
   *  Memory: 41.46MB
   */

fun toLowerCase(s: String): String {
    val chars = s.toCharArray()
    for (i in s.indices) {
        val c = s[i]

        if (c in 'A'..'Z') {
            chars[i] = (c.code or 32).toChar()
        }
    }
    return String(chars)
}
/*  My Solution
   *  Runtime: 0ms
   *  Memory: 41.18MB
   */

fun toLowerCase1(s: String): String {
    return s.lowercase()
}