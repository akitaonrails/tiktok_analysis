package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes25.dex */
public final class IdleTriggerConfig {

    @C09CT("delay_ms")
    public final long delayMs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_red_dot_block")
    public final boolean enableRedDotBlock;

    @C09CT("solaria_threshold")
    public final int solariaThreshold;

    public IdleTriggerConfig() {
        this(false, 60000L, 2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdleTriggerConfig)) {
            return false;
        }
        IdleTriggerConfig idleTriggerConfig = (IdleTriggerConfig) obj;
        return this.enable == idleTriggerConfig.enable && this.delayMs == idleTriggerConfig.delayMs && this.solariaThreshold == idleTriggerConfig.solariaThreshold && this.enableRedDotBlock == idleTriggerConfig.enableRedDotBlock;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.delayMs)) * 31) + this.solariaThreshold) * 31) + C786410Ut5.Z2(this.enableRedDotBlock);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdleTriggerConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.delayMs);
        sbLIZ.append(", solariaThreshold=");
        sbLIZ.append(this.solariaThreshold);
        sbLIZ.append(", enableRedDotBlock=");
        sbLIZ.append(this.enableRedDotBlock);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IdleTriggerConfig(boolean z, long j, int i, boolean z2) {
        this.enable = z;
        this.delayMs = j;
        this.solariaThreshold = i;
        this.enableRedDotBlock = z2;
    }
}
