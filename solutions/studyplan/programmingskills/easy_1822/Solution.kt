package studyplan.programmingskills.easy_1822


fun main() {
    println()
}

/*  My Solution
 *  Runtime: 0ms
 *  Memory: 46.96MB
 */
fun arraySign(nums: IntArray): Int {
    var sign = 1
    for (item in nums) {
        if (item == 0) return 0;
        if (item < 0) sign = -sign
    }
    return sign;
}

/*  My Solution
 *  Runtime: 0ms
 *  Memory: 48.09MB
 */
fun arraySign1(nums: IntArray): Int = if (nums.contains(0)) 0
else if (nums.count { it < 0 } % 2 == 0) 1 else -1