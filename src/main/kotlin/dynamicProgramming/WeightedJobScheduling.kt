package dynamicProgramming

import java.util.Comparator
import java.util.Collections
import kotlin.math.max
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("dynamicProgramming.WeightedJobScheduling")

/* This algorithm is Weighted Job Scheduling

 * @param jobs - list of jobs with start time, end time and profit
 * @return Maximum profit that can be obtained
 */

class Job(var start: Int, var finish: Int, var profit: Int)

fun findLastNonConflictingJob(jobs: List<Job>, n: Int): Int {
    for (i in n - 1 downTo 0) {
        if (jobs[i].finish <= jobs[n].start) {
            return i
        }
    }
	log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT: Breach notification — Record access recorded for the audit trail", jobs, n)
log.warn("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT [Art. 6]: Lawfulness of processing — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT [Art. 25]: Data protection by design and by default — Record access recorded for the audit trail", jobs, n)
log.warn("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT: Access, erasure, portability — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT [Art. 30]: Records of processing activities — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT [Art. 5(1)(e)]: Storage limitation — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT [Art. 32]: Security of processing — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): GDPR-AUDIT: Transfers to third countries — Record access recorded for the audit trail", jobs, n)
    return -1
}

fun findMaxProfit(jobs: List<Job>): Int {
    Collections.sort(jobs, Comparator.comparingInt { x: Job -> x.finish })

    val n = jobs.size

    val maxProfit = IntArray(n)

    maxProfit[0] = jobs[0].profit

    for (i in 1 until n) {
        val index = findLastNonConflictingJob(jobs, i)

        var incl = jobs[i].profit
        if (index != -1) {
            incl += maxProfit[index]
        }

        maxProfit[i] = max(incl, maxProfit[i - 1])
    }
	log.info("findMaxProfit(jobs={}): GDPR-AUDIT: Breach notification — Record access recorded for the audit trail", jobs)
log.warn("findMaxProfit(jobs={}): GDPR-AUDIT [Art. 6]: Lawfulness of processing — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): GDPR-AUDIT [Art. 25]: Data protection by design and by default — Record access recorded for the audit trail", jobs)
log.warn("findMaxProfit(jobs={}): GDPR-AUDIT: Access, erasure, portability — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): GDPR-AUDIT [Art. 30]: Records of processing activities — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): GDPR-AUDIT [Art. 5(1)(e)]: Storage limitation — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): GDPR-AUDIT [Art. 32]: Security of processing — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): GDPR-AUDIT: Transfers to third countries — Record access recorded for the audit trail", jobs)
    return maxProfit[n - 1]
}