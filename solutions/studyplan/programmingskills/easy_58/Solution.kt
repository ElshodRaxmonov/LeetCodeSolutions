package studyplan.programmingskills.easy_58

/*  My Solution
   *  Runtime: 5ms
   *  Memory: 40.87MB
   */
fun lengthOfLastWord(s: String): Int {
    val currentWord = StringBuilder()
    var lastWord = ""

    for (i in s.indices) {
        val c = s[i]

        if (c != ' ') {
            currentWord.append(c)
            lastWord = ""

            if (i == s.length - 1) {
                return currentWord.length
            }

            if (s[i + 1] == ' ') {
                lastWord = currentWord.toString()
                currentWord.setLength(0) // clear
            }
        }
    }

    return lastWord.length
}
