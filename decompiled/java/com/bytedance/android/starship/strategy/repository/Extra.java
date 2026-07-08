package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class Extra implements Serializable {

    @C09CT("logid")
    public final String logid;

    @C09CT("trace_id")
    public String traceId;

    public Extra() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return Intrinsics.LJFF(this.logid, extra.logid) && Intrinsics.LJFF(this.traceId, extra.traceId);
    }

    public int hashCode() {
        String str = this.logid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.traceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extra(logid=");
        sbLIZ.append(this.logid);
        sbLIZ.append(", traceId=");
        sbLIZ.append(this.traceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setTraceId(String str) {
        this.traceId = str;
    }

    public Extra(String str, String str2) {
        this.logid = str;
        this.traceId = str2;
    }
}
