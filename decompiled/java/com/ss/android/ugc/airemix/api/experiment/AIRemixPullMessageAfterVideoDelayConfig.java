package com.ss.android.ugc.airemix.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes.dex */
public final class AIRemixPullMessageAfterVideoDelayConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("interval")
    public final int interval;

    @C09CT("max_retry_count")
    public final int maxRetryCount;

    public AIRemixPullMessageAfterVideoDelayConfig() {
        this(true, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixPullMessageAfterVideoDelayConfig)) {
            return false;
        }
        AIRemixPullMessageAfterVideoDelayConfig aIRemixPullMessageAfterVideoDelayConfig = (AIRemixPullMessageAfterVideoDelayConfig) obj;
        return this.enable == aIRemixPullMessageAfterVideoDelayConfig.enable && this.interval == aIRemixPullMessageAfterVideoDelayConfig.interval && this.maxRetryCount == aIRemixPullMessageAfterVideoDelayConfig.maxRetryCount;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.interval) * 31) + this.maxRetryCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixPullMessageAfterVideoDelayConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", maxRetryCount=");
        sbLIZ.append(this.maxRetryCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIRemixPullMessageAfterVideoDelayConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.interval = i;
        this.maxRetryCount = i2;
    }
}
