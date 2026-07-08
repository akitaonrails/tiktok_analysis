package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryPublishWeakNetworkConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("speed_test_timeout_ms")
    public final long speedTestTimeoutMs;

    @C09CT("ttnet_control")
    public final int ttnetControl;

    @C09CT("weak_net_mbs")
    public final long weakNetSpeed;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPublishWeakNetworkConfig)) {
            return false;
        }
        StoryPublishWeakNetworkConfig storyPublishWeakNetworkConfig = (StoryPublishWeakNetworkConfig) obj;
        return this.enable == storyPublishWeakNetworkConfig.enable && this.speedTestTimeoutMs == storyPublishWeakNetworkConfig.speedTestTimeoutMs && this.ttnetControl == storyPublishWeakNetworkConfig.ttnetControl && this.weakNetSpeed == storyPublishWeakNetworkConfig.weakNetSpeed;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.speedTestTimeoutMs)) * 31) + this.ttnetControl) * 31) + C786410Ut5.Y2(this.weakNetSpeed);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPublishWeakNetworkConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", speedTestTimeoutMs=");
        sbLIZ.append(this.speedTestTimeoutMs);
        sbLIZ.append(", ttnetControl=");
        sbLIZ.append(this.ttnetControl);
        sbLIZ.append(", weakNetSpeed=");
        sbLIZ.append(this.weakNetSpeed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryPublishWeakNetworkConfig() {
        this(false, 10000L, 0, 80L);
    }

    public StoryPublishWeakNetworkConfig(boolean z, long j, int i, long j2) {
        this.enable = z;
        this.speedTestTimeoutMs = j;
        this.ttnetControl = i;
        this.weakNetSpeed = j2;
    }
}
