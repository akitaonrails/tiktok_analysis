package com.ss.android.ugc.aweme.geofencing.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryListResponse {

    @C09CT("history")
    public final List<HistoryEntry> history;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public HistoryListResponse() {
        this(0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryListResponse)) {
            return false;
        }
        HistoryListResponse historyListResponse = (HistoryListResponse) obj;
        return this.statusCode == historyListResponse.statusCode && Intrinsics.LJFF(this.statusMsg, historyListResponse.statusMsg) && Intrinsics.LJFF(this.history, historyListResponse.history);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<HistoryEntry> list = this.history;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryListResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", history=");
        sbLIZ.append(this.history);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryListResponse(int i, String str, List<HistoryEntry> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.history = list;
    }
}
