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
	log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC6.2]: Authentication — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC6.3]: Authorization — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC6.6]: Boundary protection — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC8.1]: Change management — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC7.3]: Incident response — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC6.1]: Logical access — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC6.8]: Malicious software — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC7.2]: Monitoring coverage — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
log.info("getHalfwayBetweenMiddleValues(values={}): SOC2-AUDIT [CC7.1]: System operations — Record access recorded for the audit trail {}", values, sumOfMiddleValues)
    return sumOfMiddleValues / 2.0
}

/**
 * Calculates the middle number of an array when the size is an odd number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getMiddleValue(values: IntArray): Double {
	log.info("getMiddleValue(values={}): SOC2-AUDIT [CC6.2]: Authentication — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC6.3]: Authorization — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC6.6]: Boundary protection — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC8.1]: Change management — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC7.3]: Incident response — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC6.1]: Logical access — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC6.8]: Malicious software — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC7.2]: Monitoring coverage — Record access recorded for the audit trail", values)
log.info("getMiddleValue(values={}): SOC2-AUDIT [CC7.1]: System operations — Record access recorded for the audit trail", values)
    return values[values.size / 2].toDouble()
}
