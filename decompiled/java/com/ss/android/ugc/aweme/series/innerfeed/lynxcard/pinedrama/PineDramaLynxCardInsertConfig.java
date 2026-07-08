package com.ss.android.ugc.aweme.series.innerfeed.lynxcard.pinedrama;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class PineDramaLynxCardInsertConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("no_click_cooldown_ms")
    public final long noClickCooldownMs;

    @C09CT("no_click_cooldown_trigger_count")
    public final int noClickCooldownTriggerCount;

    @C09CT("not_interest_cooldown_ms")
    public final long notInterestCooldownThresholdMs;

    @C09CT("session_show_limit")
    public final int sessionShowLimit;

    @C09CT("time_window_ms")
    public final long timeWindowMs;

    @C09CT("time_window_show_limit")
    public final int timeWindowShowLimit;

    @C09CT("trigger_video_count")
    public final int triggerVideoCount;

    public PineDramaLynxCardInsertConfig() {
        this(false, 0, 1, 0L, 0, 0, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PineDramaLynxCardInsertConfig)) {
            return false;
        }
        PineDramaLynxCardInsertConfig pineDramaLynxCardInsertConfig = (PineDramaLynxCardInsertConfig) obj;
        return this.enable == pineDramaLynxCardInsertConfig.enable && this.triggerVideoCount == pineDramaLynxCardInsertConfig.triggerVideoCount && this.sessionShowLimit == pineDramaLynxCardInsertConfig.sessionShowLimit && this.timeWindowMs == pineDramaLynxCardInsertConfig.timeWindowMs && this.timeWindowShowLimit == pineDramaLynxCardInsertConfig.timeWindowShowLimit && this.noClickCooldownTriggerCount == pineDramaLynxCardInsertConfig.noClickCooldownTriggerCount && this.noClickCooldownMs == pineDramaLynxCardInsertConfig.noClickCooldownMs && this.notInterestCooldownThresholdMs == pineDramaLynxCardInsertConfig.notInterestCooldownThresholdMs;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.triggerVideoCount) * 31) + this.sessionShowLimit) * 31) + C786410Ut5.Y2(this.timeWindowMs)) * 31) + this.timeWindowShowLimit) * 31) + this.noClickCooldownTriggerCount) * 31) + C786410Ut5.Y2(this.noClickCooldownMs)) * 31) + C786410Ut5.Y2(this.notInterestCooldownThresholdMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDramaLynxCardInsertConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", triggerVideoCount=");
        sbLIZ.append(this.triggerVideoCount);
        sbLIZ.append(", sessionShowLimit=");
        sbLIZ.append(this.sessionShowLimit);
        sbLIZ.append(", timeWindowMs=");
        sbLIZ.append(this.timeWindowMs);
        sbLIZ.append(", timeWindowShowLimit=");
        sbLIZ.append(this.timeWindowShowLimit);
        sbLIZ.append(", noClickCooldownTriggerCount=");
        sbLIZ.append(this.noClickCooldownTriggerCount);
        sbLIZ.append(", noClickCooldownMs=");
        sbLIZ.append(this.noClickCooldownMs);
        sbLIZ.append(", notInterestCooldownThresholdMs=");
        sbLIZ.append(this.notInterestCooldownThresholdMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PineDramaLynxCardInsertConfig(boolean z, int i, int i2, long j, int i3, int i4, long j2, long j3) {
        this.enable = z;
        this.triggerVideoCount = i;
        this.sessionShowLimit = i2;
        this.timeWindowMs = j;
        this.timeWindowShowLimit = i3;
        this.noClickCooldownTriggerCount = i4;
        this.noClickCooldownMs = j2;
        this.notInterestCooldownThresholdMs = j3;
    }
}
