package studyplan.programmingskills.easy_66

import java.sql.Array

/*  My Solution
   *  Runtime: 10ms
   *  Memory: 44.06MB
   */
fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i] += 1
            return digits
        }
        digits[i] = 0
    }
    val result = IntArray(digits.size + 1)
    result[0] = 0
    return digits
}

fun main() {
    println(plusOne(intArrayOf(1, 2, 3, 4)))
}