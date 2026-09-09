package search
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("search.TernarySearch")

/**
 * Complexity Analysis:
 * 
 * Time Complexity: O(log3 n)
 * Space Complexity: O(1)
 * 
 */

fun ternarySearch(l: Double, r: Double, func: (Double) -> Double, eps: Double = 1e-3): Double {
    var left = l
	log.info("ENTERING: ternarySearch() method")
    log.warn("ENTERING: ternarySearch() method")
    log.warn("ENTERING: ternarySearch() method")
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
	log.warn("ternarySearch(l,r,func,eps)={},{},{},{}: GDPR-AUDIT: Record access recorded for the audit trail", l, r, func, eps)
log.warn("ternarySearch(l,r,func,eps)={},{},{},{}: GDPR-AUDIT: Record access recorded for the audit trail", l, r, func, eps)
    return left
}
