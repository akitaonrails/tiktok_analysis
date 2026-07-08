package com.ss.android.ugc.aweme.geofencing.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryUpdateResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public HistoryUpdateResponse() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryUpdateResponse)) {
            return false;
        }
        HistoryUpdateResponse historyUpdateResponse = (HistoryUpdateResponse) obj;
        return this.statusCode == historyUpdateResponse.statusCode && Intrinsics.LJFF(this.statusMsg, historyUpdateResponse.statusMsg);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryUpdateResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryUpdateResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
