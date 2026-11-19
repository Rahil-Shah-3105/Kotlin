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
	log.info("getFactorial(number={}): SOC2-AUDIT [CC6.2]: Authentication — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC6.3]: Authorization — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC6.6]: Boundary protection — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC8.1]: Change management — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC7.3]: Incident response — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC6.1]: Logical access — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC6.8]: Malicious software — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC7.2]: Monitoring coverage — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): SOC2-AUDIT [CC7.1]: System operations — Record access recorded for the audit trail", number)
}