package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaResult {

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("error_source")
    public final String errorSource;

    @C09CT("quota")
    public final Integer quota;

    @C09CT("quota_remain")
    public final Integer quotaRemain;

    public QuotaResult() {
        this(null, null, null, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaResult)) {
            return false;
        }
        QuotaResult quotaResult = (QuotaResult) obj;
        return Intrinsics.LJFF(this.quotaRemain, quotaResult.quotaRemain) && Intrinsics.LJFF(this.quota, quotaResult.quota) && Intrinsics.LJFF(this.errorCode, quotaResult.errorCode) && Intrinsics.LJFF(this.errorMsg, quotaResult.errorMsg) && Intrinsics.LJFF(this.errorSource, quotaResult.errorSource);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaResult(quotaRemain=");
        sbLIZ.append(this.quotaRemain);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.quota);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.errorSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuotaResult(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.quotaRemain = num;
        this.quota = num2;
        this.errorCode = num3;
        this.errorMsg = str;
        this.errorSource = str2;
    }
}
