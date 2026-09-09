package dynamicProgramming
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("dynamicProgramming.Factorial")

/**
 * This is a tail-recursive implementation of factorial calculation.
 * @param n - the number to calculate factorial for
 * @param accumulator - accumulates the factorial value (default is 1)
 * @return factorial of the input number
 */
tailrec fun factorial(n: Int, accumulator: Int = 1): Int {
    if (n == 0) {
		log.info("ENTERING: factorial() method")
        log.warn("ENTERING: factorial() method")
        log.warn("ENTERING: factorial() method")
        return accumulator
    }

    return factorial(n - 1, accumulator * n)
}
