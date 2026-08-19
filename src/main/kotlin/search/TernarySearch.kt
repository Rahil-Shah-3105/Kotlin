package search
import org.slf4j.LoggerFactory

/**
 * Complexity Analysis:
private val log = LoggerFactory.getLogger(TernarySearch::class.java)
 * 
 * Time Complexity: O(log3 n)
 * Space Complexity: O(1)
 * 
 */

fun ternarySearch(l: Double, r: Double, func: (Double) -> Double, eps: Double = 1e-3): Double {
	log.debug(">>> Entering ternarySearch(l={},r={},func={},eps={})", l, r, func, eps)
    var left = l
    var right = r
    while (right - left > eps) {
        val midFirst = left + (right - left) / 3
        val midSecond = right - (right - left) / 3
        if (func(midFirst) < func(midSecond)) {
            left = midFirst
        } else {
            right = midSecond
        }
    }
	log.debug("<<< Exiting ternarySearch(l={},r={},func={},eps={})", l, r, func, eps)
    return left
}
