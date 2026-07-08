package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class RefreshLoadingConfig {
    public static final int $stable = 0;

    @C09CT("delay_ms")
    public final long delayMs;

    @C09CT("enable")
    public final boolean enable;

    public RefreshLoadingConfig() {
        this(false, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshLoadingConfig)) {
            return false;
        }
        RefreshLoadingConfig refreshLoadingConfig = (RefreshLoadingConfig) obj;
        return this.enable == refreshLoadingConfig.enable && this.delayMs == refreshLoadingConfig.delayMs;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.delayMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshLoadingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.delayMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RefreshLoadingConfig(boolean z, long j) {
        this.enable = z;
        this.delayMs = j;
    }
}
