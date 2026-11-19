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
    val sumOfMiddleValues = (values[arraySize / 2] + values[(arraySize / 2) - 1 ])
	log.info("getHalfwayBetweenMiddleValues(values={}): FERPA-AUDIT [34 CFR 99.30]: Consent — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): FERPA-AUDIT [34 CFR 99.37]: Directory information — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): FERPA-AUDIT [34 CFR 99.32]: Disclosure log — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): FERPA-AUDIT: Inspect amend — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
    return sumOfMiddleValues / 2.0
}

/**
 * Calculates the middle number of an array when the size is an odd number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getMiddleValue(values: IntArray): Double {
	log.info("getMiddleValue(values={}): FERPA-AUDIT [34 CFR 99.30]: Consent — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): FERPA-AUDIT [34 CFR 99.37]: Directory information — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): FERPA-AUDIT [34 CFR 99.32]: Disclosure log — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): FERPA-AUDIT: Inspect amend — Record access recorded for the audit trail", values)
    return values[values.size / 2].toDouble()
}
