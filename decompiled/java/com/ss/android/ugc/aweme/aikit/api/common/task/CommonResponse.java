package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommonResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public CommonResponse() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonResponse)) {
            return false;
        }
        CommonResponse commonResponse = (CommonResponse) obj;
        return Intrinsics.LJFF(this.statusCode, commonResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, commonResponse.statusMsg);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommonResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
