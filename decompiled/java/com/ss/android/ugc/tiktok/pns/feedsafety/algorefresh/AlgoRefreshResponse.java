package com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AlgoRefreshResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AlgoRefreshResponse() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoRefreshResponse)) {
            return false;
        }
        AlgoRefreshResponse algoRefreshResponse = (AlgoRefreshResponse) obj;
        return this.statusCode == algoRefreshResponse.statusCode && Intrinsics.LJFF(this.statusMsg, algoRefreshResponse.statusMsg);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoRefreshResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AlgoRefreshResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
