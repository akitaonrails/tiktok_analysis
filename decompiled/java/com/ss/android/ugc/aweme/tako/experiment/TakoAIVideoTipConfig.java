package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAIVideoTipConfig {

    @C09CT("duration_ms")
    public final long durationMs;

    @C09CT("max_show_times")
    public final int maxShowTimes;

    public TakoAIVideoTipConfig() {
        this(3, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAIVideoTipConfig)) {
            return false;
        }
        TakoAIVideoTipConfig takoAIVideoTipConfig = (TakoAIVideoTipConfig) obj;
        return this.maxShowTimes == takoAIVideoTipConfig.maxShowTimes && this.durationMs == takoAIVideoTipConfig.durationMs;
    }

    public final int hashCode() {
        return (this.maxShowTimes * 31) + C786410Ut5.Y2(this.durationMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIVideoTipConfig(maxShowTimes=");
        sbLIZ.append(this.maxShowTimes);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAIVideoTipConfig(int i, long j) {
        this.maxShowTimes = i;
        this.durationMs = j;
    }
}
