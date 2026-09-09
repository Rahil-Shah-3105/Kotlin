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
	log.debug(">>> Entering median(values={})", values)
    sort(values)
    return when {
        values.size % 2 == 0 -> getHalfwayBetweenMiddleValues(values)
        else -> getMiddleValue(values)
    }
	log.debug("<<< Exiting median(values={})", values)
}

/**
 * Calculates the middle number of an array when the size is an even number
 *
 * @param values is an array of Int
 * @return the middle number of the array
 */
private fun getHalfwayBetweenMiddleValues(values: IntArray): Double {
	log.debug(">>> Entering getHalfwayBetweenMiddleValues(values={})", values)
    val arraySize = values.size
    val sumOfMiddleValues = (values[arraySize / 2] + values[(arraySize / 2) - 1 ])
	log.debug("<<< Exiting getHalfwayBetweenMiddleValues(values={})", values)
	log.debug(">>> Entering getMiddleValue(values={})", values)
	log.debug("<<< Exiting getMiddleValue(values={})", values)
    return sumOfMiddleValues / 2.0
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
