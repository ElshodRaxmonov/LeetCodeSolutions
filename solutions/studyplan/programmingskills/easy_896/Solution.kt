package studyplan.programmingskills.easy_896


/*  My Solution
 *  Runtime: 4ms
 *  Memory: 69.72MB
 */
fun isMonotonic(nums: IntArray): Boolean {

    var inc = true;
    var dec = true;
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) continue;
        if (nums[i] < nums[i - 1]) {
            inc = false
        }
        if (nums[i] > nums[i - 1]) {
            dec = false
        }
    }
    return dec || inc;
}