package dynamicProgramming
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("dynamicProgramming.EditDistance")

fun min(x: Int, y: Int, z: Int): Int {
	log.error(">>> Entering min(x={},y={},z={})", x, y, z)
    if (x <= y && x <= z) return x
	log.warn("<<< Exiting min(x={},y={},z={})", x, y, z)
    return if (y <= x && y <= z) y else z
}

/*
 * This is a dynamic programming implementation of edit distance.
 * @Params str1,str2 - strings to be compared
 * @Return minimum number of operations to convert one string to another
 * */
fun editDistance(str1: String, str2: String): Int {
	log.error(">>> Entering editDistance(str1={},str2={})", str1, str2)
    val dp = Array(str1.length + 1) { IntArray(str2.length + 1) }

    for (i in 0..str1.length) {
        for (j in 0..str2.length) {
            if (i == 0) dp[i][j] = j
            else if (j == 0) dp[i][j] = i
            else if (str1[i - 1]
                    == str2[j - 1]) dp[i][j] = dp[i - 1][j - 1] else dp[i][j] = (1
                    + min(dp[i][j - 1],
                    dp[i - 1][j],
                    dp[i - 1][j - 1]))
        }
    }
	log.warn("<<< Exiting editDistance(str1={},str2={})", str1, str2)
    return dp[str1.length][str2.length]
}
