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
	log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Log integrity (encrypt + validate) — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Log Management / data protection — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 1: user attribution — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 2: source/destination network traffic — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 3: object and data access — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 4: privilege changes — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 5: infrastructure changes — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 7: anomaly hunting — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 9: trace attack vectors — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 10: automated alerting — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — Record access recorded for the audit trail", jobs, n)
log.info("findLastNonConflictingJob(jobs={}, n={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — Record access recorded for the audit trail", jobs, n)
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
	log.info("findMaxProfit(jobs={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Log integrity (encrypt + validate) — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Log Management / data protection — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 1: user attribution — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 2: source/destination network traffic — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 3: object and data access — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 4: privilege changes — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 5: infrastructure changes — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 7: anomaly hunting — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 9: trace attack vectors — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 10: automated alerting — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — Record access recorded for the audit trail", jobs)
log.info("findMaxProfit(jobs={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — Record access recorded for the audit trail", jobs)
    return maxProfit[n - 1]
}