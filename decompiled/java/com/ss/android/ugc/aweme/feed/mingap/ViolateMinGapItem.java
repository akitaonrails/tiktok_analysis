package com.ss.android.ugc.aweme.feed.mingap;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class ViolateMinGapItem {

    @C09CT("aid")
    public String aid;

    @C09CT("violation")
    public List<MinGapViolationResult> violationRules;

    public ViolateMinGapItem() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViolateMinGapItem(aid='");
        sbLIZ.append(this.aid);
        sbLIZ.append("', violationRules=");
        sbLIZ.append(this.violationRules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ViolateMinGapItem(String str, List<MinGapViolationResult> list) {
        this.aid = str;
        this.violationRules = list;
    }
}
