package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes3.dex */
public final class LCPConfig {

    @C09CT("enable_explore_lcp")
    public final boolean enable;

    @C09CT("lcp_refresh_grace_mills")
    public final long refreshGraceMills;

    @C09CT("lcp_timeout_mills")
    public final long timeoutMills;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LCPConfig)) {
            return false;
        }
        LCPConfig lCPConfig = (LCPConfig) obj;
        return this.enable == lCPConfig.enable && this.timeoutMills == lCPConfig.timeoutMills && this.refreshGraceMills == lCPConfig.refreshGraceMills;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.timeoutMills)) * 31) + C786410Ut5.Y2(this.refreshGraceMills);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LCPConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", timeoutMills=");
        sbLIZ.append(this.timeoutMills);
        sbLIZ.append(", refreshGraceMills=");
        sbLIZ.append(this.refreshGraceMills);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LCPConfig() {
        this(true, Mp4ScreenVideoLoadTimeout.CONTROL, 800L);
    }

    public LCPConfig(boolean z, long j, long j2) {
        this.enable = z;
        this.timeoutMills = j;
        this.refreshGraceMills = j2;
    }
}
