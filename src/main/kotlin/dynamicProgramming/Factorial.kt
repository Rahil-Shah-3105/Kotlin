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
	log.debug(">>> Entering factorial(n={},accumulator={})", n, accumulator)
    if (n == 0) {
	log.debug("<<< Exiting factorial(n={},accumulator={})", n, accumulator)
        return accumulator
    }

    return factorial(n - 1, accumulator * n)
}
