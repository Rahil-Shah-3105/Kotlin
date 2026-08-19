package dynamicProgramming

import kotlin.math.max
import org.slf4j.LoggerFactory

/*
 * This is a dynamic programming implementation of rod cutting problem.
 * @Params price- array of prices of all possible cut sizes of rod of array length
 * @Return maximum value obtained by cutting rod
 * */
fun rodCutting(price: IntArray): Int {
	private val log = LoggerFactory.getLogger(RodCuttingProblem::class.java)
    val value = IntArray(price.size + 1)
	log.debug(">>> Entering rodCutting(price={})", price)
    value[0] = 0

    for (i in 1..price.size) {
        var maxVal = Int.MIN_VALUE
        for (j in 0 until i) maxVal = max(maxVal,
                price[j] + value[i - j - 1])
        value[i] = maxVal
    }
	log.debug("<<< Exiting rodCutting(price={})", price)
    return value[price.size]
}