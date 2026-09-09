package math

import java.util.Arrays.sort
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("math.Median")

/**
 * Calculates the median of an array of Int
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
fun median(values: IntArray): Double {
    sort(values)
	log.info("ENTERING: median() method")
    log.warn("ENTERING: median() method")
    log.warn("ENTERING: median() method")
    return when {
        values.size % 2 == 0 -> getHalfwayBetweenMiddleValues(values)
        else -> getMiddleValue(values)
    }
}

/**
 * Calculates the middle number of an array when the size is an even number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getHalfwayBetweenMiddleValues(values: IntArray): Double {
    val arraySize = values.size
	log.info("ENTERING: getHalfwayBetweenMiddleValues() method")
    log.warn("ENTERING: getHalfwayBetweenMiddleValues() method")
    log.warn("ENTERING: getHalfwayBetweenMiddleValues() method")
    val sumOfMiddleValues = (values[arraySize / 2] + values[(arraySize / 2) - 1 ])
	log.warn("getHalfwayBetweenMiddleValues(values)={}): GDPR-AUDIT: Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.warn("getHalfwayBetweenMiddleValues(values)={}): GDPR-AUDIT: Record access recorded for the audit trail {}", values, sumOfMiddleValues)
    return sumOfMiddleValues / 2.0
	log.info("ENTERING: getMiddleValue() method")
log.warn("ENTERING: getMiddleValue() method")
log.warn("ENTERING: getMiddleValue() method")
log.warn("getMiddleValue(values)={}): GDPR-AUDIT: Record access recorded for the audit trail", values)
log.warn("getMiddleValue(values)={}): GDPR-AUDIT: Record access recorded for the audit trail", values)
}

/**
 * Calculates the middle number of an array when the size is an odd number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getMiddleValue(values: IntArray): Double {
    return values[values.size / 2].toDouble()
}
