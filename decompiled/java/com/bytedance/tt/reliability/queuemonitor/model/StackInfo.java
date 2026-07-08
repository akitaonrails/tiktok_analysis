package com.bytedance.tt.reliability.queuemonitor.model;

import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class StackInfo {
    public final long stackId;
    public final String stackTrace;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackInfo(stackId=");
        sbLIZ.append(this.stackId);
        sbLIZ.append(", stackTrace=");
        sbLIZ.append(this.stackTrace);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.stackId);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof StackInfo) && ((StackInfo) obj).stackId == this.stackId) {
            return true;
        }
        return false;
    }

    public StackInfo(long j, String str) {
        this.stackId = j;
        this.stackTrace = str;
    }
}
