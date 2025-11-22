package studyplan.programmingskills.easy_657

/*  My Solution
   *  Runtime: 7ms
   *  Memory: 45.04MB
   */
fun judgeCircle(moves: String): Boolean {
    var x = 0
    var y = 0

    for (m in moves) {
        when (m) {
            'L' -> x--
            'R' -> x++
            'U' -> y++
            'D' -> y--
        }
    }

    return x == 0 && y == 0
}