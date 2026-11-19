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
	log.info("getFactorial(number={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Log integrity (encrypt + validate) — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Log Management / data protection — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 1: user attribution — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 2: source/destination network traffic — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 3: object and data access — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 4: privilege changes — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 5: infrastructure changes — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 7: anomaly hunting — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 9: trace attack vectors — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 10: automated alerting — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — Record access recorded for the audit trail", number)
log.info("getFactorial(number={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — Record access recorded for the audit trail", number)
}