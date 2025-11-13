package studyplan.programmingskills.easy_1502

/*  My Solution
   *  Runtime: 10ms
   *  Memory: 46.24MB
   */

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sort() // O(n log n)
    val diff = arr[1] - arr[0]
    val n = arr.size

    for (i in 2 until n) {
        if (arr[i] - arr[i - 1] != diff) {
            return false
        }
    }
    return true
}

// Alternative Kotlin - More idiomatic
class SolutionIdiomatic {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        val diff = arr[1] - arr[0]
        return (2 until arr.size).all { arr[it] - arr[it - 1] == diff }
    }
}

