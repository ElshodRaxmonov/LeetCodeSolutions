package studyplan.programmingskills.easy_283

/*  My Solution
   *  Runtime: 87ms
   *  Memory: 50.04MB
   */
fun moveZeroes(nums: IntArray): Unit {
    var count = 0
    for (i in nums) {
        if (i == 0) {
            count++
        }
    }

    while (count > 0) {
        for (x in 1..<nums.size) {
            if (nums[x - 1] == 0) {
                val temp = nums[x - 1]
                nums[x - 1] = nums[x]
                nums[x] = temp
            }
        }
        count--
    }
}

/*  CHatGpt Solution
   *  Runtime: 3ms
   *  Memory: 52.09MB
   */
fun moveZeroes1(nums: IntArray): Unit {
    var lastNonZero = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            if (i != lastNonZero) {
                val temp = nums[lastNonZero]
                nums[lastNonZero] = nums[i]
                nums[i] = temp
            }
            lastNonZero++
        }
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 0, 4, 5, 6, 7, 8, 9, 10)
    moveZeroes(nums)
    println(nums.contentToString())
}