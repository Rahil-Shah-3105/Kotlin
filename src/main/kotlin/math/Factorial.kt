package mathematics

import java.security.InvalidParameterException
import org.slf4j.LoggerFactory

/**
 * Calculates the factorial of a natural number greater than or equal to 0 recursively.
 * @param number The number of which to calculate the factorial.
 * @return The factorial of the number passed as parameter.
 */
fun getFactorial(number: Long): Long {
	private val log = LoggerFactory.getLogger(Factorial::class.java)
    if (number < 0L) {
		log.debug(">>> Entering getFactorial(number={})", number)
		log.warn("Throwing InvalidParameterException from getFactorial(number={})", number)
		log.debug("<<< Exiting getFactorial(number={})", number)
        throw InvalidParameterException("The number of which to calculate the factorial must be greater or equal to zero.")
    } else return when (number) {
        0L -> 1
        1L -> number
        else -> number * getFactorial(number - 1)
    }
}