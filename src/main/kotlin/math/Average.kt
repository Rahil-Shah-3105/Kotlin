package math
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("math.Average")


/**
 * Calculate the average of a list of Double
 *
 * @param numbers array to store numbers
 * @return average of given numbers
 */
fun average(numbers: Array<Double>): Double {
	log.error(">>> Entering average(numbers={})", numbers)
    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
	log.warn("<<< Exiting average(numbers={})", numbers)
    return sum / numbers.size
}

/**
 * Calculate the average of a list of Int
 *
 * @param numbers array to store numbers
 * @return average of given numbers
 */
fun average(numbers: Array<Int>) : Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum / numbers.size
}
