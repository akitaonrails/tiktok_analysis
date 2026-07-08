package com.ss.android.ugc.aweme.preview.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QualityAdvisorSubmitEventResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityAdvisorSubmitEventResponse)) {
            return false;
        }
        QualityAdvisorSubmitEventResponse qualityAdvisorSubmitEventResponse = (QualityAdvisorSubmitEventResponse) obj;
        return Intrinsics.LJFF(this.statusCode, qualityAdvisorSubmitEventResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, qualityAdvisorSubmitEventResponse.statusMsg);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QualityAdvisorSubmitEventResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QualityAdvisorSubmitEventResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
