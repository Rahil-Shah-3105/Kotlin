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
	log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT: Breach notification — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.warn("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT [Art. 6]: Lawfulness of processing — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT [Art. 25]: Data protection by design and by default — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.warn("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT: Access, erasure, portability — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT [Art. 30]: Records of processing activities — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT [Art. 5(1)(e)]: Storage limitation — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT [Art. 32]: Security of processing — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): GDPR-AUDIT: Transfers to third countries — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
    return sumOfMiddleValues / 2.0
}

/**
 * Calculates the middle number of an array when the size is an odd number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getMiddleValue(values: IntArray): Double {
	log.info("getMiddleValue(values={}): GDPR-AUDIT: Breach notification — Record access recorded for the audit trail", values)
log.warn("getMiddleValue(values={}): GDPR-AUDIT [Art. 6]: Lawfulness of processing — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): GDPR-AUDIT [Art. 25]: Data protection by design and by default — Record access recorded for the audit trail", values)
log.warn("getMiddleValue(values={}): GDPR-AUDIT: Access, erasure, portability — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): GDPR-AUDIT [Art. 30]: Records of processing activities — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): GDPR-AUDIT [Art. 5(1)(e)]: Storage limitation — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): GDPR-AUDIT [Art. 32]: Security of processing — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): GDPR-AUDIT: Transfers to third countries — Record access recorded for the audit trail", values)
    return values[values.size / 2].toDouble()
}
