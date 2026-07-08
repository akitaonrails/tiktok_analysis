package com.ss.android.ugc.aweme.biz.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class PipoNetRequestRetryConfig {

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("loop_count")
    public final int loopCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoNetRequestRetryConfig)) {
            return false;
        }
        PipoNetRequestRetryConfig pipoNetRequestRetryConfig = (PipoNetRequestRetryConfig) obj;
        return this.intervalMs == pipoNetRequestRetryConfig.intervalMs && this.loopCount == pipoNetRequestRetryConfig.loopCount;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.intervalMs) * 31) + this.loopCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoNetRequestRetryConfig(intervalMs=");
        sbLIZ.append(this.intervalMs);
        sbLIZ.append(", loopCount=");
        sbLIZ.append(this.loopCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoNetRequestRetryConfig() {
        this(500L, 3);
    }

    public PipoNetRequestRetryConfig(long j, int i) {
        this.intervalMs = j;
        this.loopCount = i;
    }
}
