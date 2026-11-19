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
	log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Log integrity (encrypt + validate) — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Log Management / data protection — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 1: user attribution — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 2: source/destination network traffic — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 3: object and data access — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 4: privilege changes — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 5: infrastructure changes — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 7: anomaly hunting — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 9: trace attack vectors — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 10: automated alerting — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
    return sumOfMiddleValues / 2.0
}

/**
 * Calculates the middle number of an array when the size is an odd number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getMiddleValue(values: IntArray): Double {
	log.info("getMiddleValue(values={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Log integrity (encrypt + validate) — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Log Management / data protection — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 1: user attribution — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 2: source/destination network traffic — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 3: object and data access — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 4: privilege changes — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 5: infrastructure changes — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 7: anomaly hunting — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 9: trace attack vectors — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 10: automated alerting — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — Record access recorded for the audit trail", values)
    return values[values.size / 2].toDouble()
}
