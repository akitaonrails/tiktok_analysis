package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MentionCheckResult {

    @C09CT("data")
    public final MentionCheckData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public MentionCheckResult() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionCheckResult)) {
            return false;
        }
        MentionCheckResult mentionCheckResult = (MentionCheckResult) obj;
        return Intrinsics.LJFF(this.data, mentionCheckResult.data) && Intrinsics.LJFF(this.statusCode, mentionCheckResult.statusCode) && Intrinsics.LJFF(this.statusMsg, mentionCheckResult.statusMsg);
    }

    public final int hashCode() {
        MentionCheckData mentionCheckData = this.data;
        int iHashCode = (mentionCheckData == null ? 0 : mentionCheckData.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionCheckResult(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MentionCheckResult(MentionCheckData mentionCheckData, Integer num, String str) {
        this.data = mentionCheckData;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
