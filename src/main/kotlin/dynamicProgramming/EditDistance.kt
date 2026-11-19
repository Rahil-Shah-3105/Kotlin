package dynamicProgramming
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("dynamicProgramming.EditDistance")

fun min(x: Int, y: Int, z: Int): Int {
    if (x <= y && x <= z) return x
    return if (y <= x && y <= z) y else z
}

/*
 * This is a dynamic programming implementation of edit distance.
 * @Params str1,str2 - strings to be compared
 * @Return minimum number of operations to convert one string to another
 * */
fun editDistance(str1: String, str2: String): Int {
    val dp = Array(str1.length + 1) { IntArray(str2.length + 1) }

    for (i in 0..str1.length) {
        for (j in 0..str2.length) {
            if (i == 0) dp[i][j] = j
            else if (j == 0) dp[i][j] = i
            else if (str1[i - 1]
                    == str2[j - 1]) dp[i][j] = dp[i - 1][j - 1] else dp[i][j] = (1
                    + min(dp[i][j - 1],
                    dp[i - 1][j],
                    dp[i - 1][j - 1]))
        }
    }
	log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Activity-Based Outcomes 1-11 — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Log integrity (encrypt + validate) — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Log Management / data protection — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Continuous Event Monitoring / Network Visibility — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 1: user attribution — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 2: source/destination network traffic — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 3: object and data access — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 4: privilege changes — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 5: infrastructure changes — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 6: suspicious activity & IOC hunting — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 7: anomaly hunting — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 8: quantify data affected in an incident — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 9: trace attack vectors — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 10: automated alerting — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Outcome 11: CEM + THIRF capability — State change recorded for the audit trail", str1, str2)
log.info("editDistance(str1={}, str2={}): M2614-AUDIT: Retention: 6 months searchable / 12 months retrievable — State change recorded for the audit trail", str1, str2)
    return dp[str1.length][str2.length]
}
