package com.ss.android.ugc.aweme.feed.mingap;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes25.dex */
public final class MinGapViolationResult {
    public String LIZ;
    public String LIZIZ;

    @C09CT("gap")
    public int gap;

    @C09CT("min_gap_rule")
    public String minGapRuleId;

    @C09CT("last_item_id")
    public String previousItemId;

    @C09CT("last_item_log_id")
    public String previousItemLogId;

    @C09CT("reason")
    public String reason;

    @C09CT("violation_aid")
    public String violationAid;

    public MinGapViolationResult() {
        this(null, 0, null, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinGapViolationResult(reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", gap=");
        sbLIZ.append(this.gap);
        sbLIZ.append(", minGapRuleId=");
        sbLIZ.append(this.minGapRuleId);
        sbLIZ.append(", previousItemId=");
        sbLIZ.append(this.previousItemId);
        sbLIZ.append(", violationAid=");
        sbLIZ.append(this.violationAid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinGapViolationResult(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.reason = str;
        this.gap = i;
        this.minGapRuleId = str2;
        this.previousItemId = str3;
        this.previousItemLogId = str4;
        this.violationAid = str5;
        this.LIZ = str6;
        this.LIZIZ = str7;
    }
}
