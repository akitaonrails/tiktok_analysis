package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class HistoryOptConfig {
    public static final int $stable = 0;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("timeout_ms")
    public final long timeoutMs;

    public HistoryOptConfig() {
        this(false, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryOptConfig)) {
            return false;
        }
        HistoryOptConfig historyOptConfig = (HistoryOptConfig) obj;
        return this.enable == historyOptConfig.enable && this.timeoutMs == historyOptConfig.timeoutMs;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.timeoutMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryOptConfig(boolean z, long j) {
        this.enable = z;
        this.timeoutMs = j;
    }
}
