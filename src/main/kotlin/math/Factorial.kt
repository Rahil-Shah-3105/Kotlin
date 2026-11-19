package mathematics

import java.security.InvalidParameterException
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("mathematics.Factorial")

/**
 * Calculates the factorial of a natural number greater than or equal to 0 recursively.
 * @param number The number of which to calculate the factorial.
 * @return The factorial of the number passed as parameter.
 */
fun getFactorial(number: Long): Long {
    if (number < 0L) {
        throw InvalidParameterException("The number of which to calculate the factorial must be greater or equal to zero.")
    } else return when (number) {
        0L -> 1
        1L -> number
        else -> number * getFactorial(number - 1)
    }
	log.info("getFactorial(number={}): NIS2-AUDIT [Art. 21(2)(c)]: Business continuity — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): NIS2-AUDIT [Art. 20]: Governance — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): NIS2-AUDIT: Security events — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): NIS2-AUDIT [Art. 21(2)(d)]: Supply chain — Record access recorded for the audit trail", number)
}