package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickShareCandidate implements Serializable {

    @C09CT("candidate_id")
    public String candidateId;

    @C09CT("extra_info")
    public String extraInfo;

    @C09CT("rate_score")
    public Double rateScore;

    @C09CT("type")
    public long type;

    public QuickShareCandidate() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareCandidate(candidateId=");
        sbLIZ.append(this.candidateId);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", rateScore=");
        sbLIZ.append(this.rateScore);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickShareCandidate(String str, long j, Double d, String str2) {
        this.candidateId = str;
        this.type = j;
        this.rateScore = d;
        this.extraInfo = str2;
    }
}
